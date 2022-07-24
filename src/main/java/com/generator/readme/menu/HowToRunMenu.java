package com.generator.readme.menu;

import com.generator.readme.enums.HowToRunEnum;

import java.util.Scanner;

public class HowToRunMenu {

  private static String[][] getOptions(){
    final int SIZE = HowToRunEnum.values().length;
    String[][] options = new String[SIZE][2];

    for (HowToRunEnum option: HowToRunEnum.values()) {
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
      displayOptions(options, "How to Run");

      int option = scan.nextInt();

      if (option > -1 && option < options.length) {
        optionSelected = options[option][1];
        break;
      }
    }

    return optionSelected;
  }
}
