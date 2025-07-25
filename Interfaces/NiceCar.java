package Interfaces;

public class NiceCar {
    Engine engine ;
    NiceCar(){
        engine = new PowerEngine();
    }

    public void UpgradeEngine() {
        engine = new ElectricEngine();
    }
    public void start (){
        engine.start();
    }

}
