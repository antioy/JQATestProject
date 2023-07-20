package Homework01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numberWorkingHours: ");
        String time = scanner.nextLine();

        System.out.print("amountMoney: ");
        Double cash = Double.valueOf(scanner.nextLine());

        System.out.print("offDay - yes or no: ");
        Boolean offDay = scanner.nextLine();

        if (offDay.equals("yes")) {
            System.out.println("I have money and I will go to the cinema");
            System.out.println("I do not have money and I will watch TV");
            System.out.println(cash <= 10 ? "to the cinema with friends." : "to icecream.");

            else  (offDay.equals("no")) {
                System.out.print("I will work ");
            }
        }
    }
}