package com.mocha.pattern.singletonpattern.slackermodel;

public class Wife {
    private static Wife wife;

    private Wife() {}

    public static Wife getWife() {
        if(wife==null){
            wife = new Wife();
        }
        return wife;
    }
}
