package com.mocha.pattern.adapterpattern;

public class AdapterTest {
    public static void main(String[] args) {
        EnPluginInterface enPlugin = new EnPlugin();
        Home home = new Home();
        PluginAdapter pluginAdapter = new PluginAdapter(enPlugin);
        home.setPlugin(pluginAdapter);
        home.charge();
    }
}
