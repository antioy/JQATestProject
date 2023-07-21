package Homework01;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1num int: ");
        int num1 = scanner.nextInt();

        System.out.print("2num double: ");
        double num2 = scanner.nextDouble();

        System.out.print("3num int: ");
        int num3 = scanner.nextInt();

        System.out.print("4num double: ");
        double num4 = scanner.nextDouble();

        int tempInt = num1;
        num1 = (int) num2;
        num2 = tempInt;

        double tempDouble = num3;
        num3 = (int)num4;
        num4 = tempDouble;

        System.out.println("New numbers:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);

        double sum1 = (double)num1 + num2;
        int sum2 = num3 + (int)num4;

        System.out.println("Sum (int to double): " + sum1);
        System.out.println("Sum (double to int): " + sum2);

            }
        }

    }


