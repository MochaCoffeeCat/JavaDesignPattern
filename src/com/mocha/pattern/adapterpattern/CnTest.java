package com.mocha.pattern.adapterpattern;

public class CnTest {
    public static void main(String[] args) {
        CnPluginInterface cnPlugin = new CnPlugin();
        Home home = new Home(cnPlugin);
        home.charge();
    }
}
