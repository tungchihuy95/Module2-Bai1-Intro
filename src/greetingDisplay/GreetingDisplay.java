package greetingDisplay;

import java.util.Scanner;

public class GreetingDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Hello! " + name);
    }
}
