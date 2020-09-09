package daysInMonth;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;

        System.out.println("Enter a month: ");
        month = scanner.nextInt();
        
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Month " + month + " has 31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("Month " + month + " has 30 days");
                break;
            case 2:
                System.out.println("Month " + month + " has 28 or 29 days");
        }
    }
     
}
