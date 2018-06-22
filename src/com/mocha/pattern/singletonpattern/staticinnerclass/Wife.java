package com.mocha.pattern.singletonpattern.staticinnerclass;

/**
 * @author Mocha@15025153960@163.com
 * 静态内部类
 */
public class Wife {
    private static class WifeHolder {
        private static final Wife wife = new Wife();
    }
    private Wife() { }

    public static Wife getWife() {
        return WifeHolder.wife;
    }
}
