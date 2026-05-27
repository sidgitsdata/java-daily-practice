package week1.day3;
import java.util.Scanner;

public class Fibonaaci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        int first = 0;
        int second = 1;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for(int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;

            second = next;
        }

        sc.close();
    }
}