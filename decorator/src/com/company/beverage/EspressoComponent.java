package com.company.beverage;

public class EspressoComponent extends BeverageComponent {

    public EspressoComponent(){
        super.description = "Espresso";
    }
    @Override
    public double costs() {
        return 0.9;
    }
}
