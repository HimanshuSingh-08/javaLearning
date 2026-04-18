package OOPS.Interfaces;

public class Car implements Brake,Engine{
    @Override
    public void brake() {
         System.out.println("Breaks are getting applied stoping like a normal car !");
    }

    @Override
    public void start() {
        System.out.println("Engine starting ghr ghr ghreeee like a normal car !");
    }

    @Override
    public void stop() {
        System.out.println("Engine powered down car slowing down !");
    }

    @Override
    public void acc() {
        System.out.println("Engine getting accelerating like a normal Car!");
    }
}
