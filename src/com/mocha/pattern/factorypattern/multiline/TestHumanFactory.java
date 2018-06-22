package com.mocha.pattern.factorypattern.multiline;

public class TestHumanFactory {
    public static void main(String[] args) {
        HumanFactory hf = new HumanFactory();
        Human man = hf.createMale();
        Human woman = hf.createFemale();
        man.beat();
        woman.eat();
    }
}
