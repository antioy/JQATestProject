package Homework01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
        double fromKeyboardA = sc.nextDouble();
        System.out.println("Number A is:" + fromKeyboardA);

        System.out.println("Enter number B: ");
        double fromKeyboardB = sc.nextDouble();
        System.out.println("Number B is:" + fromKeyboardB);

        System.out.println("Enter number C: ");
        double fromKeyboardC = sc.nextDouble();
        System.out.println("Number C is:" + fromKeyboardC); {

            if (fromKeyboardC > fromKeyboardA && fromKeyboardC < fromKeyboardB)
                System.out.println("Number " + fromKeyboardC  + " is between " + fromKeyboardA + " and " + fromKeyboardB);
        }

    }

}

