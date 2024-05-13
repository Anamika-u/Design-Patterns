package FactoryPattern;

public class Truck implements Vehicle{
    @Override
    public void rent() {
        System.out.println("Renting Truck");
    }
}
