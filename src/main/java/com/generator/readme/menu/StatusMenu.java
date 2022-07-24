package com.generator.readme.menu;

import com.generator.readme.enums.StatusEnum;

import java.util.Scanner;

public class StatusMenu {

  private static String[][] getOptions(){
    final int SIZE = StatusEnum.values().length;
    String[][] options = new String[SIZE][2];

    for (StatusEnum option: StatusEnum.values()) {
      options[option.ordinal()][0] = String.valueOf(option.ordinal());
      options[option.ordinal()][1] = option.name();
    }

    return  options;
  }

  private static void displayOptions(String[][] options, String question){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";

    System.out.printf(ANSI_GREEN + "\n-> Repo %s?\n" + ANSI_RESET, question);
    for (String[] option : options) {
      System.out.print("[" + option[0] + "] " + option[1] + ", ");
    }

    System.out.print("\n>>> ");
  }

  public static String display(){
    Scanner scan = new Scanner(System.in);

    String[][] options = getOptions();
    String optionSelected;

    while (true){
      displayOptions(options, "Status");

      int option = scan.nextInt();

      if (option > -1 && option < options.length) {
        if (StatusEnum.Working.name().equals(options[option][1])) {
          optionSelected = "\uD83D\uDEA7 Project in progress... \uD83D\uDEE0";
        } else if (StatusEnum.Finished.name().equals(options[option][1])) {
          optionSelected = "Finished project ✔";
        } else {
          throw new IllegalStateException("Unexpected value: " + options[option][1]);
        }
        break;
      }
    }

    return optionSelected;
  }
}
