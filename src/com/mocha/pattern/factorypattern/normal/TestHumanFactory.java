package com.mocha.pattern.factorypattern.normal;

public class TestHumanFactory {
    public static void main(String[] args) {
        HumanFactory hf = new HumanFactory();
        Human man = hf.createHuman("male");
        man.eat();
        Human woman = hf.createHuman("female");
        woman.sleep();
    }
}
