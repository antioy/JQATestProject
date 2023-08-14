package Homework04;

public class ComputerPrice {
    public static void main(String[] args) {
        Computer a = new Computer(2010, 1100, 160.0, 3.0);
        Computer b = new Computer(2011, 1200, 170.0, 4.0);
        Computer c = new Computer(2012, 1300, 180.0, 5.0);

        int result;
        result = a.comparePrice(b);
        if (result < 0) {
            System.out.println("A is cheaper than B");
        } else if (result > 0) {
            System.out.println("A is more expensive than B");
        } else {
            System.out.println("A is the same price as B");
        }
    }
}

