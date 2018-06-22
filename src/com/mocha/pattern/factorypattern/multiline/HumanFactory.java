package com.mocha.pattern.factorypattern.multiline;

/**
 * @author Mocha@15025153960@163.com
 * 多个方法工厂模式
 */
public class HumanFactory {
    public Male createMale(){
        return new Male();
    }
    public Female createFemale(){
        return new Female();
    }
}
