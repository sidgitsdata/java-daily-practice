package week1.day4;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while(num != 0) {

            sum = sum + (num % 10);

            num = num / 10;
        }

        System.out.println("Sum of Digits = " + sum);

        sc.close();
    }
}