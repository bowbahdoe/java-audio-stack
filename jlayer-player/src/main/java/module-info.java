module dev.mccue.jlayer.player {
    requires transitive java.desktop;
    requires transitive dev.mccue.jlayer.decoder;
    requires transitive dev.mccue.jlayer.converter;

    exports dev.mccue.jlayer.player;
    exports dev.mccue.jlayer.player.advanced;
}