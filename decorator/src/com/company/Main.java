package com.company;

import com.company.beverage.BeverageComponent;
import com.company.beverage.EspressoComponent;
import com.company.beverage.MochaDecorator;
import com.company.beverage.WhipDecorator;

public class Main {

    public static void main(String[] args) {

        BeverageComponent bc1  = new EspressoComponent();
        System.out.println(bc1.getDescription());
        System.out.println("Costs "+bc1.costs()+ " $");

        BeverageComponent bc2 = new EspressoComponent();
        bc2 = new MochaDecorator(bc2);
        System.out.println(bc2.getDescription());
        System.out.println("Costs "+bc2.costs()+ " $");

        BeverageComponent bc3 = new EspressoComponent();
        bc3 = new MochaDecorator(bc3);
        bc3 = new MochaDecorator(bc3);
        bc3 = new WhipDecorator(bc3);
        System.out.println(bc3.getDescription());
        System.out.println("Costs "+bc3.costs()+ " $");
    }
}
