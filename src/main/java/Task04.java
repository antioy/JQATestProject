package Homework02;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length,int i;
        i++)
        {
            numbers[i] = random.next(1, 101);
            System.out.println("Browse with for loop:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
             System.out.println("Browse with while loop:");
            int j = 0;
            while (j < numbers.length)
            {
                System.out.println(numbers[j]);
                j++;
            }
        }
    }
}
