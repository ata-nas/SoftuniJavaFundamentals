package softuni.javafundamentals.basicsyntax.lab;

import java.util.Scanner;

public class P06ForeignLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = null;

        String country = sc.nextLine();

        switch (country) {
            case "USA":
            case "England":
                result = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                result = "Spanish";
                break;
            default:
                result = "unknown";
        }

        System.out.println(result);
    }
}
