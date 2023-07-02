package com.brahvim.openal;

public class Al {

    // region Constants.
    public static final int AL_INVALID = AlJniContact.get_AL_INVALID();
    public static final int AL_NONE = AlJniContact.get_AL_NONE();
    public static final int AL_FALSE = AlJniContact.get_AL_FALSE();
    public static final int AL_TRUE = AlJniContact.get_AL_TRUE();
    public static final int AL_SOURCE_RELATIVE = AlJniContact.get_AL_SOURCE_RELATIVE();
    public static final int AL_CONE_INNER_ANGLE = AlJniContact.get_AL_CONE_INNER_ANGLE();
    public static final int AL_CONE_OUTER_ANGLE = AlJniContact.get_AL_CONE_OUTER_ANGLE();
    public static final int AL_PITCH = AlJniContact.get_AL_PITCH();
    public static final int AL_POSITION = AlJniContact.get_AL_POSITION();
    public static final int AL_DIRECTION = AlJniContact.get_AL_DIRECTION();
    public static final int AL_VELOCITY = AlJniContact.get_AL_VELOCITY();
    public static final int AL_LOOPING = AlJniContact.get_AL_LOOPING();
    public static final int AL_BUFFER = AlJniContact.get_AL_BUFFER();
    public static final int AL_GAIN = AlJniContact.get_AL_GAIN();
    public static final int AL_MIN_GAIN = AlJniContact.get_AL_MIN_GAIN();
    public static final int AL_MAX_GAIN = AlJniContact.get_AL_MAX_GAIN();
    public static final int AL_ORIENTATION = AlJniContact.get_AL_ORIENTATION();
    public static final int AL_SOURCE_STATE = AlJniContact.get_AL_SOURCE_STATE();
    public static final int AL_INITIAL = AlJniContact.get_AL_INITIAL();
    public static final int AL_PLAYING = AlJniContact.get_AL_PLAYING();
    public static final int AL_PAUSED = AlJniContact.get_AL_PAUSED();
    public static final int AL_STOPPED = AlJniContact.get_AL_STOPPED();
    public static final int AL_BUFFERS_QUEUED = AlJniContact.get_AL_BUFFERS_QUEUED();
    public static final int AL_BUFFERS_PROCESSED = AlJniContact.get_AL_BUFFERS_PROCESSED();
    public static final int AL_REFERENCE_DISTANCE = AlJniContact.get_AL_REFERENCE_DISTANCE();
    public static final int AL_ROLLOFF_FACTOR = AlJniContact.get_AL_ROLLOFF_FACTOR();
    public static final int AL_CONE_OUTER_GAIN = AlJniContact.get_AL_CONE_OUTER_GAIN();
    public static final int AL_MAX_DISTANCE = AlJniContact.get_AL_MAX_DISTANCE();
    public static final int AL_SEC_OFFSET = AlJniContact.get_AL_SEC_OFFSET();
    public static final int AL_SAMPLE_OFFSET = AlJniContact.get_AL_SAMPLE_OFFSET();
    public static final int AL_BYTE_OFFSET = AlJniContact.get_AL_BYTE_OFFSET();
    public static final int AL_SOURCE_TYPE = AlJniContact.get_AL_SOURCE_TYPE();
    public static final int AL_STATIC = AlJniContact.get_AL_STATIC();
    public static final int AL_STREAMING = AlJniContact.get_AL_STREAMING();
    public static final int AL_UNDETERMINED = AlJniContact.get_AL_UNDETERMINED();
    public static final int AL_FORMAT_MONO8 = AlJniContact.get_AL_FORMAT_MONO8();
    public static final int AL_FORMAT_MONO16 = AlJniContact.get_AL_FORMAT_MONO16();
    public static final int AL_FORMAT_STEREO8 = AlJniContact.get_AL_FORMAT_STEREO8();
    public static final int AL_FORMAT_STEREO16 = AlJniContact.get_AL_FORMAT_STEREO16();
    public static final int AL_FREQUENCY = AlJniContact.get_AL_FREQUENCY();
    public static final int AL_BITS = AlJniContact.get_AL_BITS();
    public static final int AL_CHANNELS = AlJniContact.get_AL_CHANNELS();
    public static final int AL_SIZE = AlJniContact.get_AL_SIZE();
    public static final int AL_UNUSED = AlJniContact.get_AL_UNUSED();
    public static final int AL_PENDING = AlJniContact.get_AL_PENDING();
    public static final int AL_PROCESSED = AlJniContact.get_AL_PROCESSED();
    public static final int AL_NO_ERROR = AlJniContact.get_AL_NO_ERROR();
    public static final int AL_INVALID_NAME = AlJniContact.get_AL_INVALID_NAME();
    public static final int AL_INVALID_ENUM = AlJniContact.get_AL_INVALID_ENUM();
    public static final int AL_INVALID_VALUE = AlJniContact.get_AL_INVALID_VALUE();
    public static final int AL_INVALID_OPERATION = AlJniContact.get_AL_INVALID_OPERATION();
    public static final int AL_OUT_OF_MEMORY = AlJniContact.get_AL_OUT_OF_MEMORY();
    public static final int AL_VENDOR = AlJniContact.get_AL_VENDOR();
    public static final int AL_VERSION = AlJniContact.get_AL_VERSION();
    public static final int AL_RENDERER = AlJniContact.get_AL_RENDERER();
    public static final int AL_DOPPLER_FACTOR = AlJniContact.get_AL_DOPPLER_FACTOR();
    public static final int AL_DOPPLER_VELOCITY = AlJniContact.get_AL_DOPPLER_VELOCITY();
    public static final int AL_SPEED_OF_SOUND = AlJniContact.get_AL_SPEED_OF_SOUND();
    public static final int AL_DISTANCE_MODEL = AlJniContact.get_AL_DISTANCE_MODEL();
    public static final int AL_INVERSE_DISTANCE = AlJniContact.get_AL_INVERSE_DISTANCE();
    public static final int AL_INVERSE_DISTANCE_CLAMPED = AlJniContact.get_AL_INVERSE_DISTANCE_CLAMPED();
    public static final int AL_LINEAR_DISTANCE = AlJniContact.get_AL_LINEAR_DISTANCE();
    public static final int AL_LINEAR_DISTANCE_CLAMPED = AlJniContact.get_AL_LINEAR_DISTANCE_CLAMPED();
    public static final int AL_EXPONENT_DISTANCE = AlJniContact.get_AL_EXPONENT_DISTANCE();
    public static final int AL_EXPONENT_DISTANCE_CLAMPED = AlJniContact.get_AL_EXPONENT_DISTANCE_CLAMPED();
    // endregion

    private Al() {
        throw new UnsupportedOperationException("Sorry, but `"
                + this.getClass().getSimpleName()
                + "` is a helper class and should not be instantiated.");
    }

}
