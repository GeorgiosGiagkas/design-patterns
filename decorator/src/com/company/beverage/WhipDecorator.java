package com.company.beverage;

public class WhipDecorator extends Decorator {
    private BeverageComponent beverageComponent;

    public WhipDecorator(BeverageComponent beverageComponent) {
        this.beverageComponent = beverageComponent;
    }

    @Override
    public double costs() {
        return beverageComponent.costs() + 0.4;
    }

    @Override
    public String getDescription() {
        return beverageComponent.getDescription() +", Whip";
    }
}
