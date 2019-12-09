package com.company.beverage;

public abstract class BeverageComponent {
    protected String description;
    public abstract double costs();

    public String getDescription() {
        return description;
    }
}
