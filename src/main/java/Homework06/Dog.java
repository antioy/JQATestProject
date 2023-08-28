package Homework06;

public class Dog implements IDog {
    public void bringStick() {
        System.out.println("The dog brings stick very well");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Woof woof!");
    }

    public void play() {
        System.out.println("Can play on a different manner");
    }
}
