package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int times = 1;

        while (times <= 10) {
            System.out.printf("%d X %d = %d\n", number, times, number * times);
            times++;
        }
    }
}
