package com.mocha.pattern.factorypattern.staticstatus;

/**
 * @author Mocha@15025153960@163.com
 * 静态工厂模式
 */
public class HumanFactory {
    public static Male createMale(){
        return new Male();
    }
    public static Female createFemale(){
        return new Female();
    }
}
