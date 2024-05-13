package FactoryPattern;

public class Car implements Vehicle{
    @Override
    public void rent() {
        System.out.println("Renting Car");
    }
}
