module dev.mccue.mp3spi {
    requires java.desktop;
    requires dev.mccue.jlayer.decoder;
    requires dev.mccue.tritonus.share;

    exports dev.mccue.mp3spi;
    exports dev.mccue.mp3spi.mpeg.sampled.file;
    exports dev.mccue.mp3spi.mpeg.sampled.convert;

    provides javax.sound.sampled.spi.AudioFileReader with
            dev.mccue.mp3spi.mpeg.sampled.file.MpegAudioFileReader;

    provides javax.sound.sampled.spi.FormatConversionProvider with
            dev.mccue.mp3spi.mpeg.sampled.convert.MpegFormatConversionProvider;
}