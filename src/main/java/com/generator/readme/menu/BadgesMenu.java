package com.generator.readme.menu;

import com.generator.readme.enums.BadgesEnum;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BadgesMenu {

  private static String[][] getOptions(){
    final int SIZE = BadgesEnum.values().length;
    String[][] badgesOption = new String[SIZE][3];

    for (BadgesEnum badgesEnum: BadgesEnum.values()) {
      badgesOption[badgesEnum.ordinal()][0] = String.valueOf(badgesEnum.ordinal());
      badgesOption[badgesEnum.ordinal()][1] = badgesEnum.name();
      badgesOption[badgesEnum.ordinal()][2] = "false";
    }

    return  badgesOption;
  }

  private static void displayOptions(String[][] badgesOption){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_BLUE = "\u001B[34m";

    System.out.println(ANSI_GREEN + "\n-> Repo Badges?" + ANSI_RESET);
    for (String[] badge : badgesOption) {
      if (Objects.equals(badge[2], "true")){
        System.out.print("[" + badge[0] + "] " + ANSI_BLUE + badge[1] + ANSI_RESET + ", ");
      } else {
        System.out.print("[" + badge[0] + "] " + badge[1] + ", ");
      }
    }

    System.out.println("[-1 to exit]");
    System.out.print(">>> ");
  }

  public static ArrayList<String> display(){
    Scanner scan = new Scanner(System.in);

    String[][] badgesOption = getOptions();
    ArrayList<String> badgesSelected = new ArrayList<>();

    int option = 0;

    while (option > -1){
      displayOptions(badgesOption);

      option = scan.nextInt();

      if (option > -1 && option < badgesOption.length) {
        badgesOption[option][2] = "true";
        badgesSelected.add(badgesOption[option][1]);
      }
    }

    return badgesSelected;
  }
}
