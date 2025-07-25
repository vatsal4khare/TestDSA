package Interfaces;

public interface Engine {

    String Name="PowerEngine"; //we need not specify variables in interfaces as static
//    and final, they are by default assumed static and final

    public void start();
    public void stop();
    public void accelerate();


}
