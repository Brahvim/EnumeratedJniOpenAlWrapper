package com.brahvim.openal;

public class Alc {

    // region Constants.
    public static final int ALC_INVALID = AlJniContact.get_ALC_INVALID();
    public static final int ALC_VERSION_0_1 = AlJniContact.get_ALC_VERSION_0_1();
    public static final int ALC_FALSE = AlJniContact.get_ALC_FALSE();
    public static final int ALC_TRUE = AlJniContact.get_ALC_TRUE();
    public static final int ALC_FREQUENCY = AlJniContact.get_ALC_FREQUENCY();
    public static final int ALC_REFRESH = AlJniContact.get_ALC_REFRESH();
    public static final int ALC_SYNC = AlJniContact.get_ALC_SYNC();
    public static final int ALC_MONO_SOURCES = AlJniContact.get_ALC_MONO_SOURCES();
    public static final int ALC_STEREO_SOURCES = AlJniContact.get_ALC_STEREO_SOURCES();
    public static final int ALC_NO_ERROR = AlJniContact.get_ALC_NO_ERROR();
    public static final int ALC_INVALID_DEVICE = AlJniContact.get_ALC_INVALID_DEVICE();
    public static final int ALC_INVALID_CONTEXT = AlJniContact.get_ALC_INVALID_CONTEXT();
    public static final int ALC_INVALID_ENUM = AlJniContact.get_ALC_INVALID_ENUM();
    public static final int ALC_INVALID_VALUE = AlJniContact.get_ALC_INVALID_VALUE();
    public static final int ALC_OUT_OF_MEMORY = AlJniContact.get_ALC_OUT_OF_MEMORY();
    public static final int ALC_MAJOR_VERSION = AlJniContact.get_ALC_MAJOR_VERSION();
    public static final int ALC_MINOR_VERSION = AlJniContact.get_ALC_MINOR_VERSION();
    public static final int ALC_ATTRIBUTES_SIZE = AlJniContact.get_ALC_ATTRIBUTES_SIZE();
    public static final int ALC_ALL_ATTRIBUTES = AlJniContact.get_ALC_ALL_ATTRIBUTES();
    public static final int ALC_DEFAULT_DEVICE_SPECIFIER = AlJniContact.get_ALC_DEFAULT_DEVICE_SPECIFIER();
    public static final int ALC_DEVICE_SPECIFIER = AlJniContact.get_ALC_DEVICE_SPECIFIER();
    public static final int ALC_EXTENSIONS = AlJniContact.get_ALC_EXTENSIONS();
    public static final int ALC_EXT_CAPTURE = AlJniContact.get_ALC_EXT_CAPTURE();
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = AlJniContact.get_ALC_CAPTURE_DEVICE_SPECIFIER();
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = AlJniContact
            .get_ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER();
    public static final int ALC_CAPTURE_SAMPLES = AlJniContact.get_ALC_CAPTURE_SAMPLES();
    public static final int ALC_ENUMERATE_ALL_EXT = AlJniContact.get_ALC_ENUMERATE_ALL_EXT();
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = AlJniContact.get_ALC_DEFAULT_ALL_DEVICES_SPECIFIER();
    public static final int ALC_ALL_DEVICES_SPECIFIER = AlJniContact.get_ALC_ALL_DEVICES_SPECIFIER();
    public static final int ALC_LOKI_audio_channel = AlJniContact.get_ALC_LOKI_audio_channel();
    public static final int ALC_CHAN_MAIN_LOKI = AlJniContact.get_ALC_CHAN_MAIN_LOKI();
    public static final int ALC_CHAN_PCM_LOKI = AlJniContact.get_ALC_CHAN_PCM_LOKI();
    public static final int ALC_CHAN_CD_LOKI = AlJniContact.get_ALC_CHAN_CD_LOKI();
    public static final int ALC_EXT_EFX = AlJniContact.get_ALC_EXT_EFX();
    public static final int ALC_EXT_disconnect = AlJniContact.get_ALC_EXT_disconnect();
    public static final int ALC_CONNECTED = AlJniContact.get_ALC_CONNECTED();
    public static final int ALC_EXT_thread_local_context = AlJniContact.get_ALC_EXT_thread_local_context();
    public static final int ALC_EXT_DEDICATED = AlJniContact.get_ALC_EXT_DEDICATED();
    public static final int ALC_EXT_DEFAULT_FILTER_ORDER = AlJniContact.get_ALC_EXT_DEFAULT_FILTER_ORDER();
    public static final int ALC_DEFAULT_FILTER_ORDER = AlJniContact.get_ALC_DEFAULT_FILTER_ORDER();
    public static final String ALC_EXT_EFX_NAME = AlJniContact.get_ALC_EXT_EFX_NAME();
    public static final int ALC_EFX_MAJOR_VERSION = AlJniContact.get_ALC_EFX_MAJOR_VERSION();
    public static final int ALC_EFX_MINOR_VERSION = AlJniContact.get_ALC_EFX_MINOR_VERSION();
    public static final int ALC_MAX_AUXILIARY_SENDS = AlJniContact.get_ALC_MAX_AUXILIARY_SENDS();
    // endregion

    private Alc() {
        throw new UnsupportedOperationException("Sorry, but `"
                + this.getClass().getSimpleName()
                + "` is a helper class and should not be instantiated.");
    }

}
