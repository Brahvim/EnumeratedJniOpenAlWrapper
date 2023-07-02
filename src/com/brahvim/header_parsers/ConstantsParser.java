package com.brahvim.header_parsers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ConstantsParser {

    public static void main(final String[] p_args) {
        // VSCode starts execution in `EnumeratedJniOpenAlWrapper`!
        // PS There are `6` headers for OpenAL in `include/AL`.
        final File[] headerFiles = new File("include/AL")
                .listFiles((d, f) -> f.endsWith(".h"));

        for (final File f : headerFiles)
            ConstantsParser.parseConstants(f);
    }

    public static void parseConstants(final File p_file) {
        try (final var fileReader = new FileReader(p_file);
                final var lineReader = new BufferedReader(fileReader);
                final var fileWriter = new FileWriter(
                        "extracts/constants/" + p_file.getName().split(".h")[0] + ".consts");
                final var lineWriter = new BufferedWriter(fileWriter);) {
            boolean inCommmentToCopy = false;
            boolean endOfComment = true;

            for (String line; (line = lineReader.readLine()) != null;) {
                // If we find a line starting with `/*`,
                // ..it could be a doc comment (`/** */`), or a multi-line one (`/* */`)!
                // We copy both:
                if (line.startsWith("/*"))
                    inCommmentToCopy = true;

                if (endOfComment)
                    inCommmentToCopy = false;

                // Also, if it's the end of the comment, note that down!:
                endOfComment = line.contains("*/");

                if (inCommmentToCopy) {
                    lineWriter.write(line);
                    lineWriter.newLine();
                }

                if (line.contains("#define")) {
                    final String macroDef = line.split("#define")[1].strip();
                    final int firstSpace = macroDef.indexOf(' ');

                    if (firstSpace == -1)
                        continue;

                    final String macroName = macroDef.substring(0, firstSpace),
                            // If the macro ahs a value, we get it!:
                            macroValue = firstSpace == line.length()
                                    ? null
                                    : macroDef.substring(macroDef.lastIndexOf(' ')).trim();

                    if (macroValue == null)
                        continue;

                    lineWriter.write("public final static int ");
                    lineWriter.write(macroName);
                    lineWriter.write(" = ");
                    lineWriter.write(macroValue);
                    lineWriter.write(';');
                    lineWriter.newLine();
                    lineWriter.newLine();
                }
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
