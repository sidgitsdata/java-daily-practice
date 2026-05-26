package week1.day2;

import java.util.Scanner;

public class SwapNumberDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int temp;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping using third variable:");

        System.out.println("a = " + a);

        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without third variable:");

        System.out.println("a = " + a);

        System.out.println("b = " + b);
        
        sc.close();
        
    }
}
