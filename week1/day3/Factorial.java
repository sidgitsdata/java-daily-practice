package week1.day3;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int factorial = 1;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {

            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}