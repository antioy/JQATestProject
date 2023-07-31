package Homework01;

public class Task03 {

    public static void main(String[] args) {

        int first = 1;
        int second = 5;
        int third = 10;

        third = first;
        first = second;
        second = third;

        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

    }

}

