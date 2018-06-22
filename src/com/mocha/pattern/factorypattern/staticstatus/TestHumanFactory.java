package com.mocha.pattern.factorypattern.staticstatus;

public class TestHumanFactory {
    public static void main(String[] args) {
        Human man = HumanFactory.createMale();
        Human woman = HumanFactory.createFemale();

        man.eat();
        woman.eat();
    }
}
