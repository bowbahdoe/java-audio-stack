module dev.mccue.vorbisspi {
    requires java.desktop;
    requires dev.mccue.tritonus.share;
    requires dev.mccue.jogg;
    requires dev.mccue.jorbis;

    exports dev.mccue.vorbisspi;
    exports dev.mccue.vorbisspi.vorbis.sampled.convert;
    exports dev.mccue.vorbisspi.vorbis.sampled.file;

    provides javax.sound.sampled.spi.AudioFileReader
            with dev.mccue.vorbisspi.vorbis.sampled.file.VorbisAudioFileReader;

    provides javax.sound.sampled.spi.FormatConversionProvider
            with dev.mccue.vorbisspi.vorbis.sampled.convert.VorbisFormatConversionProvider;
}