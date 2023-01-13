package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float grade = Float.parseFloat(sc.nextLine());

        String result = "Passed!";

        boolean passed = !(grade < 3.00);

        if (!passed) {
            result = "Failed!";
        }

        System.out.println(result);
    }
}
