package com.mocha.pattern.factorypattern.abstractf;

public class Foodaholic {
    public void eat(KitchenFactory k){
        System.out.println("A foodaholic is eating "+k.getFood().getFoodName()+" with "+k.getTableWare().getToolName());
    }

    public static void main(String[] args) {
        Foodaholic foodaholic = new Foodaholic();
        AKitchenFactory kf = new AKitchenFactory();
        foodaholic.eat(kf);
    }
}
