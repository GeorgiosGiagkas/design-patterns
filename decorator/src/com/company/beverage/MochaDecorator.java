package com.company.beverage;

public class MochaDecorator extends Decorator {
    private BeverageComponent beverageComponent;

    public MochaDecorator(BeverageComponent beverageComponent){
        this.beverageComponent = beverageComponent;
    }

    @Override
    public double costs() {
        return beverageComponent.costs() + 0.3;
    }

    @Override
    public String getDescription() {
        return beverageComponent.getDescription() + ", Mocha";
    }
}
