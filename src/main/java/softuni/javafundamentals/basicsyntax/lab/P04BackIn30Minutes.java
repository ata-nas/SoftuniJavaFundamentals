package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initHour = Integer.parseInt(sc.nextLine());
        int initMinutes = Integer.parseInt(sc.nextLine());

        int incrementHour = (initHour * 60) + initMinutes + 30;

        int targetHour = incrementHour / 60;
        int targetMinutes = incrementHour % 60;

        if (targetHour > 23) {
            targetHour = 0;
        }

        System.out.printf("%d:%02d", targetHour, targetMinutes);
    }
}
