package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        float grade = Float.parseFloat(sc.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

        System.out.println(result);
    }
}
