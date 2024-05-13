package FactoryPattern;

public class Bus implements Vehicle{
    @Override
    public void rent() {
        System.out.println("Renting Bus");
    }
}
