package com.brahvim.header_parsers;

import java.io.File;

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
        System.out.println(p_file.getName());
    }

}
