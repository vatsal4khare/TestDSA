package Interfaces;

public class Main {
    public static void main(String[] args) {
        CustomCar car = new CustomCar();
//        car.start();
//        car.accelerate();
//        car.brake();
//        car.stop();
//        System.out.println(car.Name);

        Media media = new CustomCar();
//        media.stop();
//        System.out.println(media.Name); // No reference from Media interface to Engine interface

        MediaClass player = new MediaClass();
//        player.start();
//        player.stop();

        PowerEngine engineType = new PowerEngine();
//        engineType.start();

        NiceCar start = new NiceCar();
        start.start();
        start.UpgradeEngine();
        start.start();


    }
}
