package week1.day2;
import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter age: ");
        age = sc.nextInt();

        if(age >= 18) {

            System.out.println("Eligible for voting");

        } else {

            System.out.println("Not eligible for voting");
        }

        sc.close();
    }
}