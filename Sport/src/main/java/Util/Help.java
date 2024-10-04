package Util;

import java.util.Scanner;

public class Help {
    static Scanner scanner = new Scanner(System.in);

    public static String getInputString(String text){
        System.out.print(text);
        return scanner.nextLine();
    }

    public static Integer getInputInteger(String text){
        System.out.print(text);
        Integer number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}
