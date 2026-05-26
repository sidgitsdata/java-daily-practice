package week1.day2;
import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int sum = 0;

        double average;

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {

            arr[i] = sc.nextInt();

            sum = sum + arr[i];
        }

        average = sum / 5.0;

        System.out.println("Average = " + average);

        sc.close();
    }
}