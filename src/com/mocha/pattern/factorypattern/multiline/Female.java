package com.mocha.pattern.factorypattern.multiline;

/**
 * @author Mocha@15025153960@163.com
 * Female 类
 */
public class Female implements Human {
    @Override
    public void eat() {
        System.out.println("Female can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Female can sleep");
    }

    @Override
    public void beat() {
        System.out.println("Female can beat");
    }
}
