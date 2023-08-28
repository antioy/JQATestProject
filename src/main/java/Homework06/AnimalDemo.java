package Homework06;

public class AnimalDemo {
    public static void main (String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();

        bird.play();
        bird.makeSomeNoise();
        bird.fly();
        bird.synk(2);

        cat.play();
        cat.makeSomeNoise();
        cat.climb();

        dog.play();
        dog.makeSomeNoise();
        dog.bringStick();
    }
}
