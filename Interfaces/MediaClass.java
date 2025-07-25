package Interfaces;

public class MediaClass implements Media{
    @Override
    public void start() {
        System.out.println("Start from interface Media");
    }
    @Override
    public void stop() {
        System.out.println("Stop from interface Media");
    }
}
