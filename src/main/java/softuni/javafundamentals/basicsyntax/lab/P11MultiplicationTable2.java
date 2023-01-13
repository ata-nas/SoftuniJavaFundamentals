package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int timesStart = Integer.parseInt(sc.nextLine());

        do {
            System.out.printf("%d X %d = %d\n", number, timesStart, number * timesStart);
            timesStart++;
        } while (timesStart <= 10);

//        if (timesStart > 10) {
//            System.out.printf("%d X %d = %d\n", number, timesStart, number * timesStart);
//        }
//
//        for (int i = timesStart; i <= 10; i++) {
//            System.out.printf("%d X %d = %d\n", number, timesStart, number * timesStart);
//            timesStart++;
//        }
    }
}
