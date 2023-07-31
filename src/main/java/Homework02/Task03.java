package Homework02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        double n;
        var arraySize = 5;
        double[] numbers = new double[arraySize];
        Scanner scanner = new Scanner(System.in);

        numbers = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enterr a number "  + (i + 1) + ": ");
            numbers[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("The numbers are :");
        for (int i = 0; i < arraySize; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
