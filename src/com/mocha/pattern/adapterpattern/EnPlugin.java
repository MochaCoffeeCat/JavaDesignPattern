package com.mocha.pattern.adapterpattern;

public class EnPlugin implements EnPluginInterface {
    @Override
    public void chargeWith3Pins() {
        System.out.println("charge with EnPlugin");
    }
}
