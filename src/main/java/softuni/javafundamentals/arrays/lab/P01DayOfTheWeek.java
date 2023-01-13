package softuni.javafundamentals.arrays.lab;

import java.util.Scanner;

public class P01DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daysArr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };

        int userInput = Integer.parseInt(sc.nextLine());

        if (1 <= userInput && userInput <= 7) {
            System.out.println(daysArr[userInput - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
