package com.brahvim.openal;

public class ExtEfx {

    // region Constants.
    public static final int AL_METERS_PER_UNIT = AlJniContact.get_AL_METERS_PER_UNIT();
    public static final int AL_DIRECT_FILTER = AlJniContact.get_AL_DIRECT_FILTER();
    public static final int AL_AUXILIARY_SEND_FILTER = AlJniContact.get_AL_AUXILIARY_SEND_FILTER();
    public static final int AL_AIR_ABSORPTION_FACTOR = AlJniContact.get_AL_AIR_ABSORPTION_FACTOR();
    public static final int AL_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_ROOM_ROLLOFF_FACTOR();
    public static final int AL_CONE_OUTER_GAINHF = AlJniContact.get_AL_CONE_OUTER_GAINHF();
    public static final int AL_DIRECT_FILTER_GAINHF_AUTO = AlJniContact.get_AL_DIRECT_FILTER_GAINHF_AUTO();
    public static final int AL_AUXILIARY_SEND_FILTER_GAIN_AUTO = AlJniContact.get_AL_AUXILIARY_SEND_FILTER_GAIN_AUTO();
    public static final int AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = AlJniContact
            .get_AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO();
    public static final int AL_REVERB_DENSITY = AlJniContact.get_AL_REVERB_DENSITY();
    public static final int AL_REVERB_DIFFUSION = AlJniContact.get_AL_REVERB_DIFFUSION();
    public static final int AL_REVERB_GAIN = AlJniContact.get_AL_REVERB_GAIN();
    public static final int AL_REVERB_GAINHF = AlJniContact.get_AL_REVERB_GAINHF();
    public static final int AL_REVERB_DECAY_TIME = AlJniContact.get_AL_REVERB_DECAY_TIME();
    public static final int AL_REVERB_DECAY_HFRATIO = AlJniContact.get_AL_REVERB_DECAY_HFRATIO();
    public static final int AL_REVERB_REFLECTIONS_GAIN = AlJniContact.get_AL_REVERB_REFLECTIONS_GAIN();
    public static final int AL_REVERB_REFLECTIONS_DELAY = AlJniContact.get_AL_REVERB_REFLECTIONS_DELAY();
    public static final int AL_REVERB_LATE_REVERB_GAIN = AlJniContact.get_AL_REVERB_LATE_REVERB_GAIN();
    public static final int AL_REVERB_LATE_REVERB_DELAY = AlJniContact.get_AL_REVERB_LATE_REVERB_DELAY();
    public static final int AL_REVERB_AIR_ABSORPTION_GAINHF = AlJniContact.get_AL_REVERB_AIR_ABSORPTION_GAINHF();
    public static final int AL_REVERB_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_REVERB_ROOM_ROLLOFF_FACTOR();
    public static final int AL_REVERB_DECAY_HFLIMIT = AlJniContact.get_AL_REVERB_DECAY_HFLIMIT();
    public static final int AL_EAXREVERB_DENSITY = AlJniContact.get_AL_EAXREVERB_DENSITY();
    public static final int AL_EAXREVERB_DIFFUSION = AlJniContact.get_AL_EAXREVERB_DIFFUSION();
    public static final int AL_EAXREVERB_GAIN = AlJniContact.get_AL_EAXREVERB_GAIN();
    public static final int AL_EAXREVERB_GAINHF = AlJniContact.get_AL_EAXREVERB_GAINHF();
    public static final int AL_EAXREVERB_GAINLF = AlJniContact.get_AL_EAXREVERB_GAINLF();
    public static final int AL_EAXREVERB_DECAY_TIME = AlJniContact.get_AL_EAXREVERB_DECAY_TIME();
    public static final int AL_EAXREVERB_DECAY_HFRATIO = AlJniContact.get_AL_EAXREVERB_DECAY_HFRATIO();
    public static final int AL_EAXREVERB_DECAY_LFRATIO = AlJniContact.get_AL_EAXREVERB_DECAY_LFRATIO();
    public static final int AL_EAXREVERB_REFLECTIONS_GAIN = AlJniContact.get_AL_EAXREVERB_REFLECTIONS_GAIN();
    public static final int AL_EAXREVERB_REFLECTIONS_DELAY = AlJniContact.get_AL_EAXREVERB_REFLECTIONS_DELAY();
    public static final int AL_EAXREVERB_REFLECTIONS_PAN = AlJniContact.get_AL_EAXREVERB_REFLECTIONS_PAN();
    public static final int AL_EAXREVERB_LATE_REVERB_GAIN = AlJniContact.get_AL_EAXREVERB_LATE_REVERB_GAIN();
    public static final int AL_EAXREVERB_LATE_REVERB_DELAY = AlJniContact.get_AL_EAXREVERB_LATE_REVERB_DELAY();
    public static final int AL_EAXREVERB_LATE_REVERB_PAN = AlJniContact.get_AL_EAXREVERB_LATE_REVERB_PAN();
    public static final int AL_EAXREVERB_ECHO_TIME = AlJniContact.get_AL_EAXREVERB_ECHO_TIME();
    public static final int AL_EAXREVERB_ECHO_DEPTH = AlJniContact.get_AL_EAXREVERB_ECHO_DEPTH();
    public static final int AL_EAXREVERB_MODULATION_TIME = AlJniContact.get_AL_EAXREVERB_MODULATION_TIME();
    public static final int AL_EAXREVERB_MODULATION_DEPTH = AlJniContact.get_AL_EAXREVERB_MODULATION_DEPTH();
    public static final int AL_EAXREVERB_AIR_ABSORPTION_GAINHF = AlJniContact.get_AL_EAXREVERB_AIR_ABSORPTION_GAINHF();
    public static final int AL_EAXREVERB_HFREFERENCE = AlJniContact.get_AL_EAXREVERB_HFREFERENCE();
    public static final int AL_EAXREVERB_LFREFERENCE = AlJniContact.get_AL_EAXREVERB_LFREFERENCE();
    public static final int AL_EAXREVERB_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_EAXREVERB_ROOM_ROLLOFF_FACTOR();
    public static final int AL_EAXREVERB_DECAY_HFLIMIT = AlJniContact.get_AL_EAXREVERB_DECAY_HFLIMIT();
    public static final int AL_CHORUS_WAVEFORM = AlJniContact.get_AL_CHORUS_WAVEFORM();
    public static final int AL_CHORUS_PHASE = AlJniContact.get_AL_CHORUS_PHASE();
    public static final int AL_CHORUS_RATE = AlJniContact.get_AL_CHORUS_RATE();
    public static final int AL_CHORUS_DEPTH = AlJniContact.get_AL_CHORUS_DEPTH();
    public static final int AL_CHORUS_FEEDBACK = AlJniContact.get_AL_CHORUS_FEEDBACK();
    public static final int AL_CHORUS_DELAY = AlJniContact.get_AL_CHORUS_DELAY();
    public static final int AL_DISTORTION_EDGE = AlJniContact.get_AL_DISTORTION_EDGE();
    public static final int AL_DISTORTION_GAIN = AlJniContact.get_AL_DISTORTION_GAIN();
    public static final int AL_DISTORTION_LOWPASS_CUTOFF = AlJniContact.get_AL_DISTORTION_LOWPASS_CUTOFF();
    public static final int AL_DISTORTION_EQCENTER = AlJniContact.get_AL_DISTORTION_EQCENTER();
    public static final int AL_DISTORTION_EQBANDWIDTH = AlJniContact.get_AL_DISTORTION_EQBANDWIDTH();
    public static final int AL_ECHO_DELAY = AlJniContact.get_AL_ECHO_DELAY();
    public static final int AL_ECHO_LRDELAY = AlJniContact.get_AL_ECHO_LRDELAY();
    public static final int AL_ECHO_DAMPING = AlJniContact.get_AL_ECHO_DAMPING();
    public static final int AL_ECHO_FEEDBACK = AlJniContact.get_AL_ECHO_FEEDBACK();
    public static final int AL_ECHO_SPREAD = AlJniContact.get_AL_ECHO_SPREAD();
    public static final int AL_FLANGER_WAVEFORM = AlJniContact.get_AL_FLANGER_WAVEFORM();
    public static final int AL_FLANGER_PHASE = AlJniContact.get_AL_FLANGER_PHASE();
    public static final int AL_FLANGER_RATE = AlJniContact.get_AL_FLANGER_RATE();
    public static final int AL_FLANGER_DEPTH = AlJniContact.get_AL_FLANGER_DEPTH();
    public static final int AL_FLANGER_FEEDBACK = AlJniContact.get_AL_FLANGER_FEEDBACK();
    public static final int AL_FLANGER_DELAY = AlJniContact.get_AL_FLANGER_DELAY();
    public static final int AL_FREQUENCY_SHIFTER_FREQUENCY = AlJniContact.get_AL_FREQUENCY_SHIFTER_FREQUENCY();
    public static final int AL_FREQUENCY_SHIFTER_LEFT_DIRECTION = AlJniContact
            .get_AL_FREQUENCY_SHIFTER_LEFT_DIRECTION();
    public static final int AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = AlJniContact
            .get_AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION();
    public static final int AL_VOCAL_MORPHER_PHONEMEA = AlJniContact.get_AL_VOCAL_MORPHER_PHONEMEA();
    public static final int AL_VOCAL_MORPHER_PHONEMEA_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_PHONEMEA_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_PHONEMEB = AlJniContact.get_AL_VOCAL_MORPHER_PHONEMEB();
    public static final int AL_VOCAL_MORPHER_PHONEMEB_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_PHONEMEB_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_WAVEFORM = AlJniContact.get_AL_VOCAL_MORPHER_WAVEFORM();
    public static final int AL_VOCAL_MORPHER_RATE = AlJniContact.get_AL_VOCAL_MORPHER_RATE();
    public static final int AL_PITCH_SHIFTER_COARSE_TUNE = AlJniContact.get_AL_PITCH_SHIFTER_COARSE_TUNE();
    public static final int AL_PITCH_SHIFTER_FINE_TUNE = AlJniContact.get_AL_PITCH_SHIFTER_FINE_TUNE();
    public static final int AL_RING_MODULATOR_FREQUENCY = AlJniContact.get_AL_RING_MODULATOR_FREQUENCY();
    public static final int AL_RING_MODULATOR_HIGHPASS_CUTOFF = AlJniContact.get_AL_RING_MODULATOR_HIGHPASS_CUTOFF();
    public static final int AL_RING_MODULATOR_WAVEFORM = AlJniContact.get_AL_RING_MODULATOR_WAVEFORM();
    public static final int AL_AUTOWAH_ATTACK_TIME = AlJniContact.get_AL_AUTOWAH_ATTACK_TIME();
    public static final int AL_AUTOWAH_RELEASE_TIME = AlJniContact.get_AL_AUTOWAH_RELEASE_TIME();
    public static final int AL_AUTOWAH_RESONANCE = AlJniContact.get_AL_AUTOWAH_RESONANCE();
    public static final int AL_AUTOWAH_PEAK_GAIN = AlJniContact.get_AL_AUTOWAH_PEAK_GAIN();
    public static final int AL_COMPRESSOR_ONOFF = AlJniContact.get_AL_COMPRESSOR_ONOFF();
    public static final int AL_EQUALIZER_LOW_GAIN = AlJniContact.get_AL_EQUALIZER_LOW_GAIN();
    public static final int AL_EQUALIZER_LOW_CUTOFF = AlJniContact.get_AL_EQUALIZER_LOW_CUTOFF();
    public static final int AL_EQUALIZER_MID1_GAIN = AlJniContact.get_AL_EQUALIZER_MID1_GAIN();
    public static final int AL_EQUALIZER_MID1_CENTER = AlJniContact.get_AL_EQUALIZER_MID1_CENTER();
    public static final int AL_EQUALIZER_MID1_WIDTH = AlJniContact.get_AL_EQUALIZER_MID1_WIDTH();
    public static final int AL_EQUALIZER_MID2_GAIN = AlJniContact.get_AL_EQUALIZER_MID2_GAIN();
    public static final int AL_EQUALIZER_MID2_CENTER = AlJniContact.get_AL_EQUALIZER_MID2_CENTER();
    public static final int AL_EQUALIZER_MID2_WIDTH = AlJniContact.get_AL_EQUALIZER_MID2_WIDTH();
    public static final int AL_EQUALIZER_HIGH_GAIN = AlJniContact.get_AL_EQUALIZER_HIGH_GAIN();
    public static final int AL_EQUALIZER_HIGH_CUTOFF = AlJniContact.get_AL_EQUALIZER_HIGH_CUTOFF();
    public static final int AL_EFFECT_FIRST_PARAMETER = AlJniContact.get_AL_EFFECT_FIRST_PARAMETER();
    public static final int AL_EFFECT_LAST_PARAMETER = AlJniContact.get_AL_EFFECT_LAST_PARAMETER();
    public static final int AL_EFFECT_TYPE = AlJniContact.get_AL_EFFECT_TYPE();
    public static final int AL_EFFECT_NULL = AlJniContact.get_AL_EFFECT_NULL();
    public static final int AL_EFFECT_REVERB = AlJniContact.get_AL_EFFECT_REVERB();
    public static final int AL_EFFECT_CHORUS = AlJniContact.get_AL_EFFECT_CHORUS();
    public static final int AL_EFFECT_DISTORTION = AlJniContact.get_AL_EFFECT_DISTORTION();
    public static final int AL_EFFECT_ECHO = AlJniContact.get_AL_EFFECT_ECHO();
    public static final int AL_EFFECT_FLANGER = AlJniContact.get_AL_EFFECT_FLANGER();
    public static final int AL_EFFECT_FREQUENCY_SHIFTER = AlJniContact.get_AL_EFFECT_FREQUENCY_SHIFTER();
    public static final int AL_EFFECT_VOCAL_MORPHER = AlJniContact.get_AL_EFFECT_VOCAL_MORPHER();
    public static final int AL_EFFECT_PITCH_SHIFTER = AlJniContact.get_AL_EFFECT_PITCH_SHIFTER();
    public static final int AL_EFFECT_RING_MODULATOR = AlJniContact.get_AL_EFFECT_RING_MODULATOR();
    public static final int AL_EFFECT_AUTOWAH = AlJniContact.get_AL_EFFECT_AUTOWAH();
    public static final int AL_EFFECT_COMPRESSOR = AlJniContact.get_AL_EFFECT_COMPRESSOR();
    public static final int AL_EFFECT_EQUALIZER = AlJniContact.get_AL_EFFECT_EQUALIZER();
    public static final int AL_EFFECT_EAXREVERB = AlJniContact.get_AL_EFFECT_EAXREVERB();
    public static final int AL_EFFECTSLOT_EFFECT = AlJniContact.get_AL_EFFECTSLOT_EFFECT();
    public static final int AL_EFFECTSLOT_GAIN = AlJniContact.get_AL_EFFECTSLOT_GAIN();
    public static final int AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = AlJniContact.get_AL_EFFECTSLOT_AUXILIARY_SEND_AUTO();
    public static final int AL_EFFECTSLOT_NULL = AlJniContact.get_AL_EFFECTSLOT_NULL();
    public static final int AL_LOWPASS_GAIN = AlJniContact.get_AL_LOWPASS_GAIN();
    public static final int AL_LOWPASS_GAINHF = AlJniContact.get_AL_LOWPASS_GAINHF();
    public static final int AL_HIGHPASS_GAIN = AlJniContact.get_AL_HIGHPASS_GAIN();
    public static final int AL_HIGHPASS_GAINLF = AlJniContact.get_AL_HIGHPASS_GAINLF();
    public static final int AL_BANDPASS_GAIN = AlJniContact.get_AL_BANDPASS_GAIN();
    public static final int AL_BANDPASS_GAINLF = AlJniContact.get_AL_BANDPASS_GAINLF();
    public static final int AL_BANDPASS_GAINHF = AlJniContact.get_AL_BANDPASS_GAINHF();
    public static final int AL_FILTER_FIRST_PARAMETER = AlJniContact.get_AL_FILTER_FIRST_PARAMETER();
    public static final int AL_FILTER_LAST_PARAMETER = AlJniContact.get_AL_FILTER_LAST_PARAMETER();
    public static final int AL_FILTER_TYPE = AlJniContact.get_AL_FILTER_TYPE();
    public static final int AL_FILTER_NULL = AlJniContact.get_AL_FILTER_NULL();
    public static final int AL_FILTER_LOWPASS = AlJniContact.get_AL_FILTER_LOWPASS();
    public static final int AL_FILTER_HIGHPASS = AlJniContact.get_AL_FILTER_HIGHPASS();
    public static final int AL_FILTER_BANDPASS = AlJniContact.get_AL_FILTER_BANDPASS();
    public static final double AL_LOWPASS_MIN_GAIN = AlJniContact.get_AL_LOWPASS_MIN_GAIN();
    public static final double AL_LOWPASS_MAX_GAIN = AlJniContact.get_AL_LOWPASS_MAX_GAIN();
    public static final double AL_LOWPASS_DEFAULT_GAIN = AlJniContact.get_AL_LOWPASS_DEFAULT_GAIN();
    public static final double AL_LOWPASS_MIN_GAINHF = AlJniContact.get_AL_LOWPASS_MIN_GAINHF();
    public static final double AL_LOWPASS_MAX_GAINHF = AlJniContact.get_AL_LOWPASS_MAX_GAINHF();
    public static final double AL_LOWPASS_DEFAULT_GAINHF = AlJniContact.get_AL_LOWPASS_DEFAULT_GAINHF();
    public static final double AL_HIGHPASS_MIN_GAIN = AlJniContact.get_AL_HIGHPASS_MIN_GAIN();
    public static final double AL_HIGHPASS_MAX_GAIN = AlJniContact.get_AL_HIGHPASS_MAX_GAIN();
    public static final double AL_HIGHPASS_DEFAULT_GAIN = AlJniContact.get_AL_HIGHPASS_DEFAULT_GAIN();
    public static final double AL_HIGHPASS_MIN_GAINLF = AlJniContact.get_AL_HIGHPASS_MIN_GAINLF();
    public static final double AL_HIGHPASS_MAX_GAINLF = AlJniContact.get_AL_HIGHPASS_MAX_GAINLF();
    public static final double AL_HIGHPASS_DEFAULT_GAINLF = AlJniContact.get_AL_HIGHPASS_DEFAULT_GAINLF();
    public static final double AL_BANDPASS_MIN_GAIN = AlJniContact.get_AL_BANDPASS_MIN_GAIN();
    public static final double AL_BANDPASS_MAX_GAIN = AlJniContact.get_AL_BANDPASS_MAX_GAIN();
    public static final double AL_BANDPASS_DEFAULT_GAIN = AlJniContact.get_AL_BANDPASS_DEFAULT_GAIN();
    public static final double AL_BANDPASS_MIN_GAINHF = AlJniContact.get_AL_BANDPASS_MIN_GAINHF();
    public static final double AL_BANDPASS_MAX_GAINHF = AlJniContact.get_AL_BANDPASS_MAX_GAINHF();
    public static final double AL_BANDPASS_DEFAULT_GAINHF = AlJniContact.get_AL_BANDPASS_DEFAULT_GAINHF();
    public static final double AL_BANDPASS_MIN_GAINLF = AlJniContact.get_AL_BANDPASS_MIN_GAINLF();
    public static final double AL_BANDPASS_MAX_GAINLF = AlJniContact.get_AL_BANDPASS_MAX_GAINLF();
    public static final double AL_BANDPASS_DEFAULT_GAINLF = AlJniContact.get_AL_BANDPASS_DEFAULT_GAINLF();
    public static final double AL_REVERB_MIN_DENSITY = AlJniContact.get_AL_REVERB_MIN_DENSITY();
    public static final double AL_REVERB_MAX_DENSITY = AlJniContact.get_AL_REVERB_MAX_DENSITY();
    public static final double AL_REVERB_DEFAULT_DENSITY = AlJniContact.get_AL_REVERB_DEFAULT_DENSITY();
    public static final double AL_REVERB_MIN_DIFFUSION = AlJniContact.get_AL_REVERB_MIN_DIFFUSION();
    public static final double AL_REVERB_MAX_DIFFUSION = AlJniContact.get_AL_REVERB_MAX_DIFFUSION();
    public static final double AL_REVERB_DEFAULT_DIFFUSION = AlJniContact.get_AL_REVERB_DEFAULT_DIFFUSION();
    public static final double AL_REVERB_MIN_GAIN = AlJniContact.get_AL_REVERB_MIN_GAIN();
    public static final double AL_REVERB_MAX_GAIN = AlJniContact.get_AL_REVERB_MAX_GAIN();
    public static final double AL_REVERB_DEFAULT_GAIN = AlJniContact.get_AL_REVERB_DEFAULT_GAIN();
    public static final double AL_REVERB_MIN_GAINHF = AlJniContact.get_AL_REVERB_MIN_GAINHF();
    public static final double AL_REVERB_MAX_GAINHF = AlJniContact.get_AL_REVERB_MAX_GAINHF();
    public static final double AL_REVERB_DEFAULT_GAINHF = AlJniContact.get_AL_REVERB_DEFAULT_GAINHF();
    public static final double AL_REVERB_MIN_DECAY_TIME = AlJniContact.get_AL_REVERB_MIN_DECAY_TIME();
    public static final double AL_REVERB_MAX_DECAY_TIME = AlJniContact.get_AL_REVERB_MAX_DECAY_TIME();
    public static final double AL_REVERB_DEFAULT_DECAY_TIME = AlJniContact.get_AL_REVERB_DEFAULT_DECAY_TIME();
    public static final double AL_REVERB_MIN_DECAY_HFRATIO = AlJniContact.get_AL_REVERB_MIN_DECAY_HFRATIO();
    public static final double AL_REVERB_MAX_DECAY_HFRATIO = AlJniContact.get_AL_REVERB_MAX_DECAY_HFRATIO();
    public static final double AL_REVERB_DEFAULT_DECAY_HFRATIO = AlJniContact.get_AL_REVERB_DEFAULT_DECAY_HFRATIO();
    public static final double AL_REVERB_MIN_REFLECTIONS_GAIN = AlJniContact.get_AL_REVERB_MIN_REFLECTIONS_GAIN();
    public static final double AL_REVERB_MAX_REFLECTIONS_GAIN = AlJniContact.get_AL_REVERB_MAX_REFLECTIONS_GAIN();
    public static final double AL_REVERB_DEFAULT_REFLECTIONS_GAIN = AlJniContact
            .get_AL_REVERB_DEFAULT_REFLECTIONS_GAIN();
    public static final double AL_REVERB_MIN_REFLECTIONS_DELAY = AlJniContact.get_AL_REVERB_MIN_REFLECTIONS_DELAY();
    public static final double AL_REVERB_MAX_REFLECTIONS_DELAY = AlJniContact.get_AL_REVERB_MAX_REFLECTIONS_DELAY();
    public static final double AL_REVERB_DEFAULT_REFLECTIONS_DELAY = AlJniContact
            .get_AL_REVERB_DEFAULT_REFLECTIONS_DELAY();
    public static final double AL_REVERB_MIN_LATE_REVERB_GAIN = AlJniContact.get_AL_REVERB_MIN_LATE_REVERB_GAIN();
    public static final double AL_REVERB_MAX_LATE_REVERB_GAIN = AlJniContact.get_AL_REVERB_MAX_LATE_REVERB_GAIN();
    public static final double AL_REVERB_DEFAULT_LATE_REVERB_GAIN = AlJniContact
            .get_AL_REVERB_DEFAULT_LATE_REVERB_GAIN();
    public static final double AL_REVERB_MIN_LATE_REVERB_DELAY = AlJniContact.get_AL_REVERB_MIN_LATE_REVERB_DELAY();
    public static final double AL_REVERB_MAX_LATE_REVERB_DELAY = AlJniContact.get_AL_REVERB_MAX_LATE_REVERB_DELAY();
    public static final double AL_REVERB_DEFAULT_LATE_REVERB_DELAY = AlJniContact
            .get_AL_REVERB_DEFAULT_LATE_REVERB_DELAY();
    public static final double AL_REVERB_MIN_AIR_ABSORPTION_GAINHF = AlJniContact
            .get_AL_REVERB_MIN_AIR_ABSORPTION_GAINHF();
    public static final double AL_REVERB_MAX_AIR_ABSORPTION_GAINHF = AlJniContact
            .get_AL_REVERB_MAX_AIR_ABSORPTION_GAINHF();
    public static final double AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF =
    AlJniContact
get_.AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF();
    public static final double AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR();
    public static final double AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR();
    public static final double AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR =
    AlJniContact
get_.AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR();
    public static final int AL_REVERB_MIN_DECAY_HFLIMIT = AlJniContact.get_AL_REVERB_MIN_DECAY_HFLIMIT();
    public static final int AL_REVERB_MAX_DECAY_HFLIMIT = AlJniContact.get_AL_REVERB_MAX_DECAY_HFLIMIT();
    public static final int AL_REVERB_DEFAULT_DECAY_HFLIMIT = AlJniContact.get_AL_REVERB_DEFAULT_DECAY_HFLIMIT();
    public static final double AL_EAXREVERB_MIN_DENSITY = AlJniContact.get_AL_EAXREVERB_MIN_DENSITY();
    public static final double AL_EAXREVERB_MAX_DENSITY = AlJniContact.get_AL_EAXREVERB_MAX_DENSITY();
    public static final double AL_EAXREVERB_DEFAULT_DENSITY = AlJniContact.get_AL_EAXREVERB_DEFAULT_DENSITY();
    public static final double AL_EAXREVERB_MIN_DIFFUSION = AlJniContact.get_AL_EAXREVERB_MIN_DIFFUSION();
    public static final double AL_EAXREVERB_MAX_DIFFUSION = AlJniContact.get_AL_EAXREVERB_MAX_DIFFUSION();
    public static final double AL_EAXREVERB_DEFAULT_DIFFUSION = AlJniContact.get_AL_EAXREVERB_DEFAULT_DIFFUSION();
    public static final double AL_EAXREVERB_MIN_GAIN = AlJniContact.get_AL_EAXREVERB_MIN_GAIN();
    public static final double AL_EAXREVERB_MAX_GAIN = AlJniContact.get_AL_EAXREVERB_MAX_GAIN();
    public static final double AL_EAXREVERB_DEFAULT_GAIN = AlJniContact.get_AL_EAXREVERB_DEFAULT_GAIN();
    public static final double AL_EAXREVERB_MIN_GAINHF = AlJniContact.get_AL_EAXREVERB_MIN_GAINHF();
    public static final double AL_EAXREVERB_MAX_GAINHF = AlJniContact.get_AL_EAXREVERB_MAX_GAINHF();
    public static final double AL_EAXREVERB_DEFAULT_GAINHF = AlJniContact.get_AL_EAXREVERB_DEFAULT_GAINHF();
    public static final double AL_EAXREVERB_MIN_GAINLF = AlJniContact.get_AL_EAXREVERB_MIN_GAINLF();
    public static final double AL_EAXREVERB_MAX_GAINLF = AlJniContact.get_AL_EAXREVERB_MAX_GAINLF();
    public static final double AL_EAXREVERB_DEFAULT_GAINLF = AlJniContact.get_AL_EAXREVERB_DEFAULT_GAINLF();
    public static final double AL_EAXREVERB_MIN_DECAY_TIME = AlJniContact.get_AL_EAXREVERB_MIN_DECAY_TIME();
    public static final double AL_EAXREVERB_MAX_DECAY_TIME = AlJniContact.get_AL_EAXREVERB_MAX_DECAY_TIME();
    public static final double AL_EAXREVERB_DEFAULT_DECAY_TIME = AlJniContact.get_AL_EAXREVERB_DEFAULT_DECAY_TIME();
    public static final double AL_EAXREVERB_MIN_DECAY_HFRATIO = AlJniContact.get_AL_EAXREVERB_MIN_DECAY_HFRATIO();
    public static final double AL_EAXREVERB_MAX_DECAY_HFRATIO = AlJniContact.get_AL_EAXREVERB_MAX_DECAY_HFRATIO();
    public static final double AL_EAXREVERB_DEFAULT_DECAY_HFRATIO = AlJniContact
            .get_AL_EAXREVERB_DEFAULT_DECAY_HFRATIO();
    public static final double AL_EAXREVERB_MIN_DECAY_LFRATIO = AlJniContact.get_AL_EAXREVERB_MIN_DECAY_LFRATIO();
    public static final double AL_EAXREVERB_MAX_DECAY_LFRATIO = AlJniContact.get_AL_EAXREVERB_MAX_DECAY_LFRATIO();
    public static final double AL_EAXREVERB_DEFAULT_DECAY_LFRATIO = AlJniContact
            .get_AL_EAXREVERB_DEFAULT_DECAY_LFRATIO();
    public static final double AL_EAXREVERB_MIN_REFLECTIONS_GAIN = AlJniContact.get_AL_EAXREVERB_MIN_REFLECTIONS_GAIN();
    public static final double AL_EAXREVERB_MAX_REFLECTIONS_GAIN = AlJniContact.get_AL_EAXREVERB_MAX_REFLECTIONS_GAIN();
    public static final double AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN();
    public static final double AL_EAXREVERB_MIN_REFLECTIONS_DELAY = AlJniContact
            .get_AL_EAXREVERB_MIN_REFLECTIONS_DELAY();
    public static final double AL_EAXREVERB_MAX_REFLECTIONS_DELAY = AlJniContact
            .get_AL_EAXREVERB_MAX_REFLECTIONS_DELAY();
    public static final double AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY();
    public static final double AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ();
    public static final double AL_EAXREVERB_MIN_LATE_REVERB_GAIN = AlJniContact.get_AL_EAXREVERB_MIN_LATE_REVERB_GAIN();
    public static final double AL_EAXREVERB_MAX_LATE_REVERB_GAIN = AlJniContact.get_AL_EAXREVERB_MAX_LATE_REVERB_GAIN();
    public static final double AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN();
    public static final double AL_EAXREVERB_MIN_LATE_REVERB_DELAY = AlJniContact
            .get_AL_EAXREVERB_MIN_LATE_REVERB_DELAY();
    public static final double AL_EAXREVERB_MAX_LATE_REVERB_DELAY = AlJniContact
            .get_AL_EAXREVERB_MAX_LATE_REVERB_DELAY();
    public static final double AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY();
    public static final double AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ();
    public static final double AL_EAXREVERB_MIN_ECHO_TIME = AlJniContact.get_AL_EAXREVERB_MIN_ECHO_TIME();
    public static final double AL_EAXREVERB_MAX_ECHO_TIME = AlJniContact.get_AL_EAXREVERB_MAX_ECHO_TIME();
    public static final double AL_EAXREVERB_DEFAULT_ECHO_TIME = AlJniContact.get_AL_EAXREVERB_DEFAULT_ECHO_TIME();
    public static final double AL_EAXREVERB_MIN_ECHO_DEPTH = AlJniContact.get_AL_EAXREVERB_MIN_ECHO_DEPTH();
    public static final double AL_EAXREVERB_MAX_ECHO_DEPTH = AlJniContact.get_AL_EAXREVERB_MAX_ECHO_DEPTH();
    public static final double AL_EAXREVERB_DEFAULT_ECHO_DEPTH = AlJniContact.get_AL_EAXREVERB_DEFAULT_ECHO_DEPTH();
    public static final double AL_EAXREVERB_MIN_MODULATION_TIME = AlJniContact.get_AL_EAXREVERB_MIN_MODULATION_TIME();
    public static final double AL_EAXREVERB_MAX_MODULATION_TIME = AlJniContact.get_AL_EAXREVERB_MAX_MODULATION_TIME();
    public static final double AL_EAXREVERB_DEFAULT_MODULATION_TIME = AlJniContact
            .get_AL_EAXREVERB_DEFAULT_MODULATION_TIME();
    public static final double AL_EAXREVERB_MIN_MODULATION_DEPTH = AlJniContact.get_AL_EAXREVERB_MIN_MODULATION_DEPTH();
    public static final double AL_EAXREVERB_MAX_MODULATION_DEPTH = AlJniContact.get_AL_EAXREVERB_MAX_MODULATION_DEPTH();
    public static final double AL_EAXREVERB_DEFAULT_MODULATION_DEPTH =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_MODULATION_DEPTH();
    public static final double AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF =
    AlJniContact
get_.AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF();
    public static final double AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF =
    AlJniContact
get_.AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF();
    public static final double AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF();
    public static final double AL_EAXREVERB_MIN_HFREFERENCE = AlJniContact.get_AL_EAXREVERB_MIN_HFREFERENCE();
    public static final double AL_EAXREVERB_MAX_HFREFERENCE = AlJniContact.get_AL_EAXREVERB_MAX_HFREFERENCE();
    public static final double AL_EAXREVERB_DEFAULT_HFREFERENCE = AlJniContact.get_AL_EAXREVERB_DEFAULT_HFREFERENCE();
    public static final double AL_EAXREVERB_MIN_LFREFERENCE = AlJniContact.get_AL_EAXREVERB_MIN_LFREFERENCE();
    public static final double AL_EAXREVERB_MAX_LFREFERENCE = AlJniContact.get_AL_EAXREVERB_MAX_LFREFERENCE();
    public static final double AL_EAXREVERB_DEFAULT_LFREFERENCE = AlJniContact.get_AL_EAXREVERB_DEFAULT_LFREFERENCE();
    public static final double AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR = AlJniContact
            .get_AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR();
    public static final double AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR = AlJniContact
            .get_AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR();
    public static final double AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR =
    AlJniContact
get_.AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR();
    public static final int AL_EAXREVERB_MIN_DECAY_HFLIMIT = AlJniContact.get_AL_EAXREVERB_MIN_DECAY_HFLIMIT();
    public static final int AL_EAXREVERB_MAX_DECAY_HFLIMIT = AlJniContact.get_AL_EAXREVERB_MAX_DECAY_HFLIMIT();
    public static final int AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = AlJniContact.get_AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT();
    public static final int AL_CHORUS_WAVEFORM_SINUSOID = AlJniContact.get_AL_CHORUS_WAVEFORM_SINUSOID();
    public static final int AL_CHORUS_WAVEFORM_TRIANGLE = AlJniContact.get_AL_CHORUS_WAVEFORM_TRIANGLE();
    public static final int AL_CHORUS_MIN_WAVEFORM = AlJniContact.get_AL_CHORUS_MIN_WAVEFORM();
    public static final int AL_CHORUS_MAX_WAVEFORM = AlJniContact.get_AL_CHORUS_MAX_WAVEFORM();
    public static final int AL_CHORUS_DEFAULT_WAVEFORM = AlJniContact.get_AL_CHORUS_DEFAULT_WAVEFORM();
    public static final int AL_CHORUS_MIN_PHASE = AlJniContact.get_AL_CHORUS_MIN_PHASE();
    public static final int AL_CHORUS_MAX_PHASE = AlJniContact.get_AL_CHORUS_MAX_PHASE();
    public static final int AL_CHORUS_DEFAULT_PHASE = AlJniContact.get_AL_CHORUS_DEFAULT_PHASE();
    public static final double AL_CHORUS_MIN_RATE = AlJniContact.get_AL_CHORUS_MIN_RATE();
    public static final double AL_CHORUS_MAX_RATE = AlJniContact.get_AL_CHORUS_MAX_RATE();
    public static final double AL_CHORUS_DEFAULT_RATE = AlJniContact.get_AL_CHORUS_DEFAULT_RATE();
    public static final double AL_CHORUS_MIN_DEPTH = AlJniContact.get_AL_CHORUS_MIN_DEPTH();
    public static final double AL_CHORUS_MAX_DEPTH = AlJniContact.get_AL_CHORUS_MAX_DEPTH();
    public static final double AL_CHORUS_DEFAULT_DEPTH = AlJniContact.get_AL_CHORUS_DEFAULT_DEPTH();
    public static final double AL_CHORUS_MIN_FEEDBACK = AlJniContact.get_AL_CHORUS_MIN_FEEDBACK();
    public static final double AL_CHORUS_MAX_FEEDBACK = AlJniContact.get_AL_CHORUS_MAX_FEEDBACK();
    public static final double AL_CHORUS_DEFAULT_FEEDBACK = AlJniContact.get_AL_CHORUS_DEFAULT_FEEDBACK();
    public static final double AL_CHORUS_MIN_DELAY = AlJniContact.get_AL_CHORUS_MIN_DELAY();
    public static final double AL_CHORUS_MAX_DELAY = AlJniContact.get_AL_CHORUS_MAX_DELAY();
    public static final double AL_CHORUS_DEFAULT_DELAY = AlJniContact.get_AL_CHORUS_DEFAULT_DELAY();
    public static final double AL_DISTORTION_MIN_EDGE = AlJniContact.get_AL_DISTORTION_MIN_EDGE();
    public static final double AL_DISTORTION_MAX_EDGE = AlJniContact.get_AL_DISTORTION_MAX_EDGE();
    public static final double AL_DISTORTION_DEFAULT_EDGE = AlJniContact.get_AL_DISTORTION_DEFAULT_EDGE();
    public static final double AL_DISTORTION_MIN_GAIN = AlJniContact.get_AL_DISTORTION_MIN_GAIN();
    public static final double AL_DISTORTION_MAX_GAIN = AlJniContact.get_AL_DISTORTION_MAX_GAIN();
    public static final double AL_DISTORTION_DEFAULT_GAIN = AlJniContact.get_AL_DISTORTION_DEFAULT_GAIN();
    public static final double AL_DISTORTION_MIN_LOWPASS_CUTOFF = AlJniContact.get_AL_DISTORTION_MIN_LOWPASS_CUTOFF();
    public static final double AL_DISTORTION_MAX_LOWPASS_CUTOFF = AlJniContact.get_AL_DISTORTION_MAX_LOWPASS_CUTOFF();
    public static final double AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = AlJniContact
            .get_AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF();
    public static final double AL_DISTORTION_MIN_EQCENTER = AlJniContact.get_AL_DISTORTION_MIN_EQCENTER();
    public static final double AL_DISTORTION_MAX_EQCENTER = AlJniContact.get_AL_DISTORTION_MAX_EQCENTER();
    public static final double AL_DISTORTION_DEFAULT_EQCENTER = AlJniContact.get_AL_DISTORTION_DEFAULT_EQCENTER();
    public static final double AL_DISTORTION_MIN_EQBANDWIDTH = AlJniContact.get_AL_DISTORTION_MIN_EQBANDWIDTH();
    public static final double AL_DISTORTION_MAX_EQBANDWIDTH = AlJniContact.get_AL_DISTORTION_MAX_EQBANDWIDTH();
    public static final double AL_DISTORTION_DEFAULT_EQBANDWIDTH = AlJniContact.get_AL_DISTORTION_DEFAULT_EQBANDWIDTH();
    public static final double AL_ECHO_MIN_DELAY = AlJniContact.get_AL_ECHO_MIN_DELAY();
    public static final double AL_ECHO_MAX_DELAY = AlJniContact.get_AL_ECHO_MAX_DELAY();
    public static final double AL_ECHO_DEFAULT_DELAY = AlJniContact.get_AL_ECHO_DEFAULT_DELAY();
    public static final double AL_ECHO_MIN_LRDELAY = AlJniContact.get_AL_ECHO_MIN_LRDELAY();
    public static final double AL_ECHO_MAX_LRDELAY = AlJniContact.get_AL_ECHO_MAX_LRDELAY();
    public static final double AL_ECHO_DEFAULT_LRDELAY = AlJniContact.get_AL_ECHO_DEFAULT_LRDELAY();
    public static final double AL_ECHO_MIN_DAMPING = AlJniContact.get_AL_ECHO_MIN_DAMPING();
    public static final double AL_ECHO_MAX_DAMPING = AlJniContact.get_AL_ECHO_MAX_DAMPING();
    public static final double AL_ECHO_DEFAULT_DAMPING = AlJniContact.get_AL_ECHO_DEFAULT_DAMPING();
    public static final double AL_ECHO_MIN_FEEDBACK = AlJniContact.get_AL_ECHO_MIN_FEEDBACK();
    public static final double AL_ECHO_MAX_FEEDBACK = AlJniContact.get_AL_ECHO_MAX_FEEDBACK();
    public static final double AL_ECHO_DEFAULT_FEEDBACK = AlJniContact.get_AL_ECHO_DEFAULT_FEEDBACK();
    public static final double AL_ECHO_MIN_SPREAD = AlJniContact.get_AL_ECHO_MIN_SPREAD();
    public static final double AL_ECHO_MAX_SPREAD = AlJniContact.get_AL_ECHO_MAX_SPREAD();
    public static final double AL_ECHO_DEFAULT_SPREAD = AlJniContact.get_AL_ECHO_DEFAULT_SPREAD();
    public static final int AL_FLANGER_WAVEFORM_SINUSOID = AlJniContact.get_AL_FLANGER_WAVEFORM_SINUSOID();
    public static final int AL_FLANGER_WAVEFORM_TRIANGLE = AlJniContact.get_AL_FLANGER_WAVEFORM_TRIANGLE();
    public static final int AL_FLANGER_MIN_WAVEFORM = AlJniContact.get_AL_FLANGER_MIN_WAVEFORM();
    public static final int AL_FLANGER_MAX_WAVEFORM = AlJniContact.get_AL_FLANGER_MAX_WAVEFORM();
    public static final int AL_FLANGER_DEFAULT_WAVEFORM = AlJniContact.get_AL_FLANGER_DEFAULT_WAVEFORM();
    public static final int AL_FLANGER_MIN_PHASE = AlJniContact.get_AL_FLANGER_MIN_PHASE();
    public static final int AL_FLANGER_MAX_PHASE = AlJniContact.get_AL_FLANGER_MAX_PHASE();
    public static final int AL_FLANGER_DEFAULT_PHASE = AlJniContact.get_AL_FLANGER_DEFAULT_PHASE();
    public static final double AL_FLANGER_MIN_RATE = AlJniContact.get_AL_FLANGER_MIN_RATE();
    public static final double AL_FLANGER_MAX_RATE = AlJniContact.get_AL_FLANGER_MAX_RATE();
    public static final double AL_FLANGER_DEFAULT_RATE = AlJniContact.get_AL_FLANGER_DEFAULT_RATE();
    public static final double AL_FLANGER_MIN_DEPTH = AlJniContact.get_AL_FLANGER_MIN_DEPTH();
    public static final double AL_FLANGER_MAX_DEPTH = AlJniContact.get_AL_FLANGER_MAX_DEPTH();
    public static final double AL_FLANGER_DEFAULT_DEPTH = AlJniContact.get_AL_FLANGER_DEFAULT_DEPTH();
    public static final double AL_FLANGER_MIN_FEEDBACK = AlJniContact.get_AL_FLANGER_MIN_FEEDBACK();
    public static final double AL_FLANGER_MAX_FEEDBACK = AlJniContact.get_AL_FLANGER_MAX_FEEDBACK();
    public static final double AL_FLANGER_DEFAULT_FEEDBACK = AlJniContact.get_AL_FLANGER_DEFAULT_FEEDBACK();
    public static final double AL_FLANGER_MIN_DELAY = AlJniContact.get_AL_FLANGER_MIN_DELAY();
    public static final double AL_FLANGER_MAX_DELAY = AlJniContact.get_AL_FLANGER_MAX_DELAY();
    public static final double AL_FLANGER_DEFAULT_DELAY = AlJniContact.get_AL_FLANGER_DEFAULT_DELAY();
    public static final double AL_FREQUENCY_SHIFTER_MIN_FREQUENCY = AlJniContact
            .get_AL_FREQUENCY_SHIFTER_MIN_FREQUENCY();
    public static final double AL_FREQUENCY_SHIFTER_MAX_FREQUENCY = AlJniContact
            .get_AL_FREQUENCY_SHIFTER_MAX_FREQUENCY();
    public static final double AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY =
    AlJniContact
get_.AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY();
    public static final int AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION =
    AlJniContact
get_.AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION();
    public static final int AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION =
    AlJniContact
get_.AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION();
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION =
    AlJniContact
get_.AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION();
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_DOWN = AlJniContact
            .get_AL_FREQUENCY_SHIFTER_DIRECTION_DOWN();
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_UP = AlJniContact.get_AL_FREQUENCY_SHIFTER_DIRECTION_UP();
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_OFF = AlJniContact.get_AL_FREQUENCY_SHIFTER_DIRECTION_OFF();
    public static final int AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION =
    AlJniContact
get_.AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION();
    public static final int AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION =
    AlJniContact
get_.AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION();
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION =
    AlJniContact
get_.AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION();
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA = AlJniContact.get_AL_VOCAL_MORPHER_MIN_PHONEMEA();
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA = AlJniContact.get_AL_VOCAL_MORPHER_MAX_PHONEMEA();
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA = AlJniContact.get_AL_VOCAL_MORPHER_DEFAULT_PHONEMEA();
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB = AlJniContact.get_AL_VOCAL_MORPHER_MIN_PHONEMEB();
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB = AlJniContact.get_AL_VOCAL_MORPHER_MAX_PHONEMEB();
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB = AlJniContact.get_AL_VOCAL_MORPHER_DEFAULT_PHONEMEB();
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING =
    AlJniContact
get_.AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING();
    public static final int AL_VOCAL_MORPHER_PHONEME_A = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_A();
    public static final int AL_VOCAL_MORPHER_PHONEME_E = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_E();
    public static final int AL_VOCAL_MORPHER_PHONEME_I = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_I();
    public static final int AL_VOCAL_MORPHER_PHONEME_O = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_O();
    public static final int AL_VOCAL_MORPHER_PHONEME_U = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_U();
    public static final int AL_VOCAL_MORPHER_PHONEME_AA = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_AA();
    public static final int AL_VOCAL_MORPHER_PHONEME_AE = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_AE();
    public static final int AL_VOCAL_MORPHER_PHONEME_AH = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_AH();
    public static final int AL_VOCAL_MORPHER_PHONEME_AO = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_AO();
    public static final int AL_VOCAL_MORPHER_PHONEME_EH = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_EH();
    public static final int AL_VOCAL_MORPHER_PHONEME_ER = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_ER();
    public static final int AL_VOCAL_MORPHER_PHONEME_IH = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_IH();
    public static final int AL_VOCAL_MORPHER_PHONEME_IY = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_IY();
    public static final int AL_VOCAL_MORPHER_PHONEME_UH = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_UH();
    public static final int AL_VOCAL_MORPHER_PHONEME_UW = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_UW();
    public static final int AL_VOCAL_MORPHER_PHONEME_B = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_B();
    public static final int AL_VOCAL_MORPHER_PHONEME_D = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_D();
    public static final int AL_VOCAL_MORPHER_PHONEME_F = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_F();
    public static final int AL_VOCAL_MORPHER_PHONEME_G = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_G();
    public static final int AL_VOCAL_MORPHER_PHONEME_J = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_J();
    public static final int AL_VOCAL_MORPHER_PHONEME_K = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_K();
    public static final int AL_VOCAL_MORPHER_PHONEME_L = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_L();
    public static final int AL_VOCAL_MORPHER_PHONEME_M = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_M();
    public static final int AL_VOCAL_MORPHER_PHONEME_N = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_N();
    public static final int AL_VOCAL_MORPHER_PHONEME_P = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_P();
    public static final int AL_VOCAL_MORPHER_PHONEME_R = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_R();
    public static final int AL_VOCAL_MORPHER_PHONEME_S = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_S();
    public static final int AL_VOCAL_MORPHER_PHONEME_T = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_T();
    public static final int AL_VOCAL_MORPHER_PHONEME_V = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_V();
    public static final int AL_VOCAL_MORPHER_PHONEME_Z = AlJniContact.get_AL_VOCAL_MORPHER_PHONEME_Z();
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SINUSOID = AlJniContact.get_AL_VOCAL_MORPHER_WAVEFORM_SINUSOID();
    public static final int AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE = AlJniContact.get_AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE();
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH = AlJniContact.get_AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH();
    public static final int AL_VOCAL_MORPHER_MIN_WAVEFORM = AlJniContact.get_AL_VOCAL_MORPHER_MIN_WAVEFORM();
    public static final int AL_VOCAL_MORPHER_MAX_WAVEFORM = AlJniContact.get_AL_VOCAL_MORPHER_MAX_WAVEFORM();
    public static final int AL_VOCAL_MORPHER_DEFAULT_WAVEFORM = AlJniContact.get_AL_VOCAL_MORPHER_DEFAULT_WAVEFORM();
    public static final double AL_VOCAL_MORPHER_MIN_RATE = AlJniContact.get_AL_VOCAL_MORPHER_MIN_RATE();
    public static final double AL_VOCAL_MORPHER_MAX_RATE = AlJniContact.get_AL_VOCAL_MORPHER_MAX_RATE();
    public static final double AL_VOCAL_MORPHER_DEFAULT_RATE = AlJniContact.get_AL_VOCAL_MORPHER_DEFAULT_RATE();
    public static final int AL_PITCH_SHIFTER_MIN_COARSE_TUNE = AlJniContact.get_AL_PITCH_SHIFTER_MIN_COARSE_TUNE();
    public static final int AL_PITCH_SHIFTER_MAX_COARSE_TUNE = AlJniContact.get_AL_PITCH_SHIFTER_MAX_COARSE_TUNE();
    public static final int AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = AlJniContact
            .get_AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE();
    public static final int AL_PITCH_SHIFTER_MIN_FINE_TUNE = AlJniContact.get_AL_PITCH_SHIFTER_MIN_FINE_TUNE();
    public static final int AL_PITCH_SHIFTER_MAX_FINE_TUNE = AlJniContact.get_AL_PITCH_SHIFTER_MAX_FINE_TUNE();
    public static final int AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE = AlJniContact.get_AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE();
    public static final double AL_RING_MODULATOR_MIN_FREQUENCY = AlJniContact.get_AL_RING_MODULATOR_MIN_FREQUENCY();
    public static final double AL_RING_MODULATOR_MAX_FREQUENCY = AlJniContact.get_AL_RING_MODULATOR_MAX_FREQUENCY();
    public static final double AL_RING_MODULATOR_DEFAULT_FREQUENCY = AlJniContact
            .get_AL_RING_MODULATOR_DEFAULT_FREQUENCY();
    public static final double AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF =
    AlJniContact
get_.AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF();
    public static final double AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF =
    AlJniContact
get_.AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF();
    public static final double AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF =
    AlJniContact
get_.AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF();
    public static final int AL_RING_MODULATOR_SINUSOID = AlJniContact.get_AL_RING_MODULATOR_SINUSOID();
    public static final int AL_RING_MODULATOR_SAWTOOTH = AlJniContact.get_AL_RING_MODULATOR_SAWTOOTH();
    public static final int AL_RING_MODULATOR_SQUARE = AlJniContact.get_AL_RING_MODULATOR_SQUARE();
    public static final int AL_RING_MODULATOR_MIN_WAVEFORM = AlJniContact.get_AL_RING_MODULATOR_MIN_WAVEFORM();
    public static final int AL_RING_MODULATOR_MAX_WAVEFORM = AlJniContact.get_AL_RING_MODULATOR_MAX_WAVEFORM();
    public static final int AL_RING_MODULATOR_DEFAULT_WAVEFORM = AlJniContact.get_AL_RING_MODULATOR_DEFAULT_WAVEFORM();
    public static final double AL_AUTOWAH_MIN_ATTACK_TIME = AlJniContact.get_AL_AUTOWAH_MIN_ATTACK_TIME();
    public static final double AL_AUTOWAH_MAX_ATTACK_TIME = AlJniContact.get_AL_AUTOWAH_MAX_ATTACK_TIME();
    public static final double AL_AUTOWAH_DEFAULT_ATTACK_TIME = AlJniContact.get_AL_AUTOWAH_DEFAULT_ATTACK_TIME();
    public static final double AL_AUTOWAH_MIN_RELEASE_TIME = AlJniContact.get_AL_AUTOWAH_MIN_RELEASE_TIME();
    public static final double AL_AUTOWAH_MAX_RELEASE_TIME = AlJniContact.get_AL_AUTOWAH_MAX_RELEASE_TIME();
    public static final double AL_AUTOWAH_DEFAULT_RELEASE_TIME = AlJniContact.get_AL_AUTOWAH_DEFAULT_RELEASE_TIME();
    public static final double AL_AUTOWAH_MIN_RESONANCE = AlJniContact.get_AL_AUTOWAH_MIN_RESONANCE();
    public static final double AL_AUTOWAH_MAX_RESONANCE = AlJniContact.get_AL_AUTOWAH_MAX_RESONANCE();
    public static final double AL_AUTOWAH_DEFAULT_RESONANCE = AlJniContact.get_AL_AUTOWAH_DEFAULT_RESONANCE();
    public static final double AL_AUTOWAH_MIN_PEAK_GAIN = AlJniContact.get_AL_AUTOWAH_MIN_PEAK_GAIN();
    public static final double AL_AUTOWAH_MAX_PEAK_GAIN = AlJniContact.get_AL_AUTOWAH_MAX_PEAK_GAIN();
    public static final double AL_AUTOWAH_DEFAULT_PEAK_GAIN = AlJniContact.get_AL_AUTOWAH_DEFAULT_PEAK_GAIN();
    public static final int AL_COMPRESSOR_MIN_ONOFF = AlJniContact.get_AL_COMPRESSOR_MIN_ONOFF();
    public static final int AL_COMPRESSOR_MAX_ONOFF = AlJniContact.get_AL_COMPRESSOR_MAX_ONOFF();
    public static final int AL_COMPRESSOR_DEFAULT_ONOFF = AlJniContact.get_AL_COMPRESSOR_DEFAULT_ONOFF();
    public static final double AL_EQUALIZER_MIN_LOW_GAIN = AlJniContact.get_AL_EQUALIZER_MIN_LOW_GAIN();
    public static final double AL_EQUALIZER_MAX_LOW_GAIN = AlJniContact.get_AL_EQUALIZER_MAX_LOW_GAIN();
    public static final double AL_EQUALIZER_DEFAULT_LOW_GAIN = AlJniContact.get_AL_EQUALIZER_DEFAULT_LOW_GAIN();
    public static final double AL_EQUALIZER_MIN_LOW_CUTOFF = AlJniContact.get_AL_EQUALIZER_MIN_LOW_CUTOFF();
    public static final double AL_EQUALIZER_MAX_LOW_CUTOFF = AlJniContact.get_AL_EQUALIZER_MAX_LOW_CUTOFF();
    public static final double AL_EQUALIZER_DEFAULT_LOW_CUTOFF = AlJniContact.get_AL_EQUALIZER_DEFAULT_LOW_CUTOFF();
    public static final double AL_EQUALIZER_MIN_MID1_GAIN = AlJniContact.get_AL_EQUALIZER_MIN_MID1_GAIN();
    public static final double AL_EQUALIZER_MAX_MID1_GAIN = AlJniContact.get_AL_EQUALIZER_MAX_MID1_GAIN();
    public static final double AL_EQUALIZER_DEFAULT_MID1_GAIN = AlJniContact.get_AL_EQUALIZER_DEFAULT_MID1_GAIN();
    public static final double AL_EQUALIZER_MIN_MID1_CENTER = AlJniContact.get_AL_EQUALIZER_MIN_MID1_CENTER();
    public static final double AL_EQUALIZER_MAX_MID1_CENTER = AlJniContact.get_AL_EQUALIZER_MAX_MID1_CENTER();
    public static final double AL_EQUALIZER_DEFAULT_MID1_CENTER = AlJniContact.get_AL_EQUALIZER_DEFAULT_MID1_CENTER();
    public static final double AL_EQUALIZER_MIN_MID1_WIDTH = AlJniContact.get_AL_EQUALIZER_MIN_MID1_WIDTH();
    public static final double AL_EQUALIZER_MAX_MID1_WIDTH = AlJniContact.get_AL_EQUALIZER_MAX_MID1_WIDTH();
    public static final double AL_EQUALIZER_DEFAULT_MID1_WIDTH = AlJniContact.get_AL_EQUALIZER_DEFAULT_MID1_WIDTH();
    public static final double AL_EQUALIZER_MIN_MID2_GAIN = AlJniContact.get_AL_EQUALIZER_MIN_MID2_GAIN();
    public static final double AL_EQUALIZER_MAX_MID2_GAIN = AlJniContact.get_AL_EQUALIZER_MAX_MID2_GAIN();
    public static final double AL_EQUALIZER_DEFAULT_MID2_GAIN = AlJniContact.get_AL_EQUALIZER_DEFAULT_MID2_GAIN();
    public static final double AL_EQUALIZER_MIN_MID2_CENTER = AlJniContact.get_AL_EQUALIZER_MIN_MID2_CENTER();
    public static final double AL_EQUALIZER_MAX_MID2_CENTER = AlJniContact.get_AL_EQUALIZER_MAX_MID2_CENTER();
    public static final double AL_EQUALIZER_DEFAULT_MID2_CENTER = AlJniContact.get_AL_EQUALIZER_DEFAULT_MID2_CENTER();
    public static final double AL_EQUALIZER_MIN_MID2_WIDTH = AlJniContact.get_AL_EQUALIZER_MIN_MID2_WIDTH();
    public static final double AL_EQUALIZER_MAX_MID2_WIDTH = AlJniContact.get_AL_EQUALIZER_MAX_MID2_WIDTH();
    public static final double AL_EQUALIZER_DEFAULT_MID2_WIDTH = AlJniContact.get_AL_EQUALIZER_DEFAULT_MID2_WIDTH();
    public static final double AL_EQUALIZER_MIN_HIGH_GAIN = AlJniContact.get_AL_EQUALIZER_MIN_HIGH_GAIN();
    public static final double AL_EQUALIZER_MAX_HIGH_GAIN = AlJniContact.get_AL_EQUALIZER_MAX_HIGH_GAIN();
    public static final double AL_EQUALIZER_DEFAULT_HIGH_GAIN = AlJniContact.get_AL_EQUALIZER_DEFAULT_HIGH_GAIN();
    public static final double AL_EQUALIZER_MIN_HIGH_CUTOFF = AlJniContact.get_AL_EQUALIZER_MIN_HIGH_CUTOFF();
    public static final double AL_EQUALIZER_MAX_HIGH_CUTOFF = AlJniContact.get_AL_EQUALIZER_MAX_HIGH_CUTOFF();
    public static final double AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = AlJniContact.get_AL_EQUALIZER_DEFAULT_HIGH_CUTOFF();
    public static final double AL_MIN_AIR_ABSORPTION_FACTOR = AlJniContact.get_AL_MIN_AIR_ABSORPTION_FACTOR();
    public static final double AL_MAX_AIR_ABSORPTION_FACTOR = AlJniContact.get_AL_MAX_AIR_ABSORPTION_FACTOR();
    public static final double AL_DEFAULT_AIR_ABSORPTION_FACTOR = AlJniContact.get_AL_DEFAULT_AIR_ABSORPTION_FACTOR();
    public static final double AL_MIN_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_MIN_ROOM_ROLLOFF_FACTOR();
    public static final double AL_MAX_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_MAX_ROOM_ROLLOFF_FACTOR();
    public static final double AL_DEFAULT_ROOM_ROLLOFF_FACTOR = AlJniContact.get_AL_DEFAULT_ROOM_ROLLOFF_FACTOR();
    public static final double AL_MIN_CONE_OUTER_GAINHF = AlJniContact.get_AL_MIN_CONE_OUTER_GAINHF();
    public static final double AL_MAX_CONE_OUTER_GAINHF = AlJniContact.get_AL_MAX_CONE_OUTER_GAINHF();
    public static final double AL_DEFAULT_CONE_OUTER_GAINHF = AlJniContact.get_AL_DEFAULT_CONE_OUTER_GAINHF();
    public static final int AL_MIN_DIRECT_FILTER_GAINHF_AUTO = AlJniContact.get_AL_MIN_DIRECT_FILTER_GAINHF_AUTO();
    public static final int AL_MAX_DIRECT_FILTER_GAINHF_AUTO = AlJniContact.get_AL_MAX_DIRECT_FILTER_GAINHF_AUTO();
    public static final int AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO = AlJniContact
            .get_AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO();
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO = AlJniContact
            .get_AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO();
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO = AlJniContact
            .get_AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO();
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO =
    AlJniContact
get_.AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO();
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO =
    AlJniContact
get_.AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO();
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO =
    AlJniContact
get_.AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO();
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO =
    AlJniContact
get_.AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO();
    public static final double AL_DEFAULT_METERS_PER_UNIT = AlJniContact.get_AL_DEFAULT_METERS_PER_UNIT();
    // endregion

    private ExtEfx() {
        throw new UnsupportedOperationException("Sorry, but `"
                + this.getClass().getSimpleName()
                + "` is a helper class and should not be instantiated.");
    }

}
