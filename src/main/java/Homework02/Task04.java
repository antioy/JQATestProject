package Homework02;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int numbers =0;
        int[] array = new int[10];

        array [0] = 1;


            System.out.println("Browse with for loop:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
             System.out.println("Browse with while loop:");
            int j = 0;
            while (j < array.length)
            {
                System.out.println(array[j]);
                j++;
            }
        }
    }

