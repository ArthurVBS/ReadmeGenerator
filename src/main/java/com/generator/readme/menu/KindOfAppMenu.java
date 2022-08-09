package com.generator.readme.menu;

import com.generator.readme.enums.KindOfAppEnum;

import java.util.Scanner;

public class KindOfAppMenu {

  private static String[][] getOptions(){
    final int SIZE = KindOfAppEnum.values().length;
    String[][] options = new String[SIZE][2];

    for (KindOfAppEnum option: KindOfAppEnum.values()) {
      options[option.ordinal()][0] = String.valueOf(option.ordinal());
      options[option.ordinal()][1] = option.name();
    }

    return  options;
  }

  private static void displayOptions(String[][] options){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";

    System.out.printf(ANSI_GREEN + "\n-> Repo kind of App?\n" + ANSI_RESET);
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
      displayOptions(options);

      int option = scan.nextInt();

      if (option > -1 && option < options.length) {
        optionSelected = options[option][1];
        break;
      }
    }

    return optionSelected;
  }
}
