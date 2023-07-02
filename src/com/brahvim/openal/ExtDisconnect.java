package com.brahvim.openal;

public class ExtDisconnect {

    public static final int ALC_EXT_disconnect = 1;
    public static final int ALC_CONNECTED = 0x313;

    private ExtDisconnect() {
        throw new UnsupportedOperationException("Sorry, but `"
                + this.getClass().getSimpleName()
                + "` is a helper class and should not be instantiated.");
    }

}
