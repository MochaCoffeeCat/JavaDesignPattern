package com.mocha.pattern.singletonpattern.slackermodelsafe;

/**
 * @author Mocha@15025153960@163.com
 * 懒汉模式 (线程安全)
 */
public class Wife {
    private static Wife wife;
    public Wife() {}

    public static synchronized Wife getWife() {
        if(wife == null) {
            wife = new Wife();
        }
        return wife;
    }
}
