package com.mocha.pattern.singletonpattern.starvingmodel;

public class Wife {
    String name;

    private static final Wife wife = new Wife("Miniya");

    private Wife(String name) {
        this.name = name;
    }

    public static Wife getWife() {
        return wife;
    }
}
