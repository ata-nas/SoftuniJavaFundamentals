package softuni.javafundamentals.datatypesandvariables.lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pounds = Float.parseFloat(sc.nextLine());

        float courseDollar = 1.36F;

        float dollars = pounds * courseDollar;

        System.out.printf("%.3f", dollars);
    }
}
