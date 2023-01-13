package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P12EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = Integer.parseInt(sc.nextLine());

            if (num % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(num));
                break;
            }
            System.out.println("Please write an even number.");
        }
    }
}
