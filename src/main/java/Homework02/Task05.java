package Homework02;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int[] originalArray = { 10, 12, 1, 8, 4 };
        int[] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++)
        {
            copiedArray[i] = originalArray[i];

            System.out.println(Arrays.toString(originalArray));
            System.out.println(Arrays.toString(copiedArray));

         //   System.out.println(("First Array: " + String.join(" ", originalArray));
         //   System.out.println(("The Array which copy: " + String.join(" ", copiedArray));


        }
    }
}
