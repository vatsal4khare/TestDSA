package Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Start from interface Engine");
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }
}
