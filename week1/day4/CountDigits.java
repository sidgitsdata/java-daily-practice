package week1.day4;
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int count = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while(num != 0) {

            count++;

            num = num / 10;
        }

        System.out.println("Number of Digits = " + count);

        sc.close();
    }
}