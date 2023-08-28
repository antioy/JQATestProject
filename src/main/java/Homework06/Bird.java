package Homework06;

public class Bird extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("The animal eats");
    }

    @Override
    public void sleep() {
        System.out.println("The bird sleep very well");
    }

    @Override
    public void play() {
        System.out.println("The bird plays easy");

    public void fly() {
            System.out.println("The bird can fly");

    }

    @Override
    public void synk () {
            System.out.println("Chirping loudly with {numBirds} birds.");

        }

    @Override
    public void makeSomeNoise() {
    }

}
