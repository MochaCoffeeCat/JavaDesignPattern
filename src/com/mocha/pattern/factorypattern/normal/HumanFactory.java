package com.mocha.pattern.factorypattern.normal;

/**
 * @author Mocha@15025153960@163.com
 * 普通工厂模式
 */
public class HumanFactory {
    public Human createHuman(String gender) {
        if(gender.equals("male")){
            return new Male();
        }else if(gender.equals("female")){
            return new Female();
        }else{
            System.out.println("输入类型不正确");
            return null;
        }
    }
}
