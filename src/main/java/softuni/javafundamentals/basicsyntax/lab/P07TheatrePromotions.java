package softuni.javafundamentals.basicsyntax.lab;

import java.util.Objects;
import java.util.Scanner;

public class P07TheatrePromotions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "Error!";

        Integer price = null;

        String day = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        if (day.equals("Weekday")) {
            if (age >= 0 && age <= 18) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            } else if (age > 64 && age <= 122) {
                price = 12;
            }
        } else if (day.equals("Weekend")) {
            if (age >= 0 && age <= 18) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            } else if (age > 64 && age <= 122) {
                price = 15;
            }
        } else if (day.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            }
        }

        if (Objects.nonNull(price)) {
            result = String.format("%d$", price);
        }
        System.out.println(result);
    }
}
