package com.generator.readme.menu;

import com.generator.readme.enums.StatusEnum;

import java.util.Scanner;

public class StatusMenu {

  private static String[][] getOptions(){
    final int SIZE = StatusEnum.values().length;
    String[][] statusOption = new String[SIZE][2];

    for (StatusEnum statusEnum: StatusEnum.values()) {
      statusOption[statusEnum.ordinal()][0] = String.valueOf(statusEnum.ordinal());
      statusOption[statusEnum.ordinal()][1] = statusEnum.name();
    }

    return statusOption;
  }

  private static void displayOptions(String[][] statusOption){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";

    System.out.println(ANSI_GREEN + "\n-> Repo Status?" + ANSI_RESET);
    for (String[] status : statusOption) {
      System.out.print("[" + status[0] + "] " + status[1] + ", ");
    }

    System.out.print("\n>>> ");
  }

  public static String display(){
    Scanner scan = new Scanner(System.in);

    String[][] statusOption = getOptions();
    String statusSelected;

    while (true){
      displayOptions(statusOption);

      int option = scan.nextInt();

      if (option > -1 && option < statusOption.length) {
        if (StatusEnum.Working.name().equals(statusOption[option][1])) {
          statusSelected = "\uD83D\uDEA7 Project in progress... \uD83D\uDEE0";
        } else if (StatusEnum.Finished.name().equals(statusOption[option][1])) {
          statusSelected = "Finished project ✔";
        } else {
          throw new IllegalStateException("Unexpected value: " + statusOption[option][1]);
        }
        break;
      }
    }

    return statusSelected;
  }
}
