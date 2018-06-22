package com.mocha.pattern.decoratorpattern;

public class Tall extends GirlDecorator {
    private Girl girl;

    public Tall(Girl g) {
        this.girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription()+"+is very tall";
    }
}
