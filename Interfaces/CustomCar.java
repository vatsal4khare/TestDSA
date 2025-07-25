package Interfaces;

public class CustomCar implements Media,Engine,Brake{

    @Override
    public void brake() {
        System.out.println("Brake from interface Brake");
    }
    @Override
    public void accelerate() {
        System.out.println("Acc from interface Engine");
    }
    @Override
    public void start() {
        System.out.println("Start from interface Engine");
    }
    @Override
    public void stop() {
        System.out.println("Stop from interface Engine");
    }

}
