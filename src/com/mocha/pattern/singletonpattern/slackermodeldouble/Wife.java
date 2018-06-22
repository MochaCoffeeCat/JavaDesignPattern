package com.mocha.pattern.singletonpattern.slackermodeldouble;

public class Wife {
    private volatile static Wife wife;
    private Wife() {}

    public static Wife getWife() {
        if(wife == null){
            synchronized (Wife.class) {
                if (wife == null) {
                    wife = new Wife();
                }
            }
        }
        return wife;
    }
}
