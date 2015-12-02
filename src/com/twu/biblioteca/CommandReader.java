package com.twu.biblioteca;

import java.util.Scanner;

public class CommandReader {
    String option;

    public CommandReader() {
        option = "";
    }

    public int readInput() {
        Scanner scan = new Scanner(System.in);
        option = scan.nextLine();
        return validate(option);
    }

    public int validate(String input) {

        if (!isNumeric(input)) {
            return 4;
        }
        return Integer.parseInt(input);
    }

    public boolean isNumeric(String input) {
        return input.matches("^[0-9]");
    }
}
