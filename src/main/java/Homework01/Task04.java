package Homework01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of working hours: ");
        int time = scanner.nextInt();

        System.out.print("Enter an amount of money: ");
        double money = scanner.nextDouble();

        System.out.print("Is it a day off (true/false): ");
        boolean isDayOff = Boolean.parseBoolean(scanner.nextLine());

        if (!isDayOff) {
                System.out.println("I will work");
            } else {
                if (money > 0) {
                    System.out.println("I'm going to the cinema");
                }
                else {
                    System.out.println("I will stay at home and watch TV");
                }

            if (money < 10) {
                System.out.println("I'll go for ice cream");
            }
        }
    }
}