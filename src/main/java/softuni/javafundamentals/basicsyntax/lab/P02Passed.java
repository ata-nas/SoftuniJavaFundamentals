package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P02Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float grade = Float.parseFloat(sc.nextLine());

        String result = "";

        boolean passed = grade >= 3.00;

        if (passed) {
            result = "Passed!";
        }

        System.out.println(result);
    }
}
