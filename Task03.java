package Homework02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        double[] numbers = new double[n];
        Scanner scanner = new Scanner(System.in);
        const int arraySize = 5;
        double[] numbers = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter a number {i + 1}: ");
            numbers[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("The numbers are :");
        for (int i = 0; i < arraySize; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
