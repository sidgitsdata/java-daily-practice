package week1.day4;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int original;
        int reverse = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        original = num;

        while(num != 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        if(original == reverse) {

            System.out.println("Palindrome Number");

        } else {

            System.out.println("Not Palindrome Number");
        }

        sc.close();
    }
}