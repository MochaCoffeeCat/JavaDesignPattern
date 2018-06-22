package com.mocha.pattern.factorypattern.abstractf;

public class AKitchenFactory implements KitchenFactory {
    @Override
    public Food getFood() {
        return new Apple();
    }

    @Override
    public TableWare getTableWare() {
        return new Knife();
    }
}
