package com.mocha.pattern.singletonpattern.starvingmodel;

public class Test {
    public static void main(String[] args) {
        Wife miniya = Wife.getWife();
        System.out.println(miniya);
    }
}
