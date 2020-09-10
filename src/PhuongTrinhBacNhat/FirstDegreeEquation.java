package PhuongTrinhBacNhat;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        double a, b;

        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();


        if (a != 0) {
            double solution = -b/a;
            System.out.printf("The solution x = %f", solution);

        }else {
            if (b == 0) {
                System.out.println("The solution is all x");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
