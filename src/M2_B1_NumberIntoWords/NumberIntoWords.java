package M2_B1_NumberIntoWords;

import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid Value!");
        } else {
            switch (number) {
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println("Two");
                case 3:
                    System.out.println("Three");
                case 4:
                    System.out.println("Four");
                case 5:
                    System.out.println("Five");
                case 6:
                    System.out.println("Six");
                case 7:
                    System.out.println("Seven");
                case 8:
                    System.out.println("Eight");
                case 9:
                    System.out.println("Nine");
                case 10:
                    System.out.println("Ten");
                case 11:
                    System.out.println("Eleven");
                case 12:
                    System.out.println("Twelve");
            }

        }




    }
}
