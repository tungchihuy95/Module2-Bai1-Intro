package M2_B1_IntroToJava;

import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println("Oop! " + year + " is not a Leap year.");
        }
    }
}
