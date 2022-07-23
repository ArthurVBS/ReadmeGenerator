package com.generator.readme.menu;

import com.generator.readme.enums.LicenseEnum;

import java.util.Scanner;

public class LicenseMenu {

  private static String[][] getOptions(){
    final int SIZE = LicenseEnum.values().length;
    String[][] statusOption = new String[SIZE][2];

    for (LicenseEnum statusEnum: LicenseEnum.values()) {
      statusOption[statusEnum.ordinal()][0] = String.valueOf(statusEnum.ordinal());
      statusOption[statusEnum.ordinal()][1] = statusEnum.name();
    }

    return statusOption;
  }

  private static void displayOptions(String[][] licenseOption){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";

    System.out.println(ANSI_GREEN + "\n-> Repo License?" + ANSI_RESET);
    for (String[] license : licenseOption) {
      System.out.print("[" + license[0] + "] " + license[1] + ", ");
    }

    System.out.print("\n>>> ");
  }

  public static String display(){
    Scanner scan = new Scanner(System.in);

    String[][] licenseOption = getOptions();
    String licenseSelected;

    while (true){
      displayOptions(licenseOption);

      int option = scan.nextInt();

      if (option > -1 && option < licenseOption.length) {
        if (LicenseEnum.MIT.name().equals(licenseOption[option][1])) {
          licenseSelected = "MIT";
        } else if (LicenseEnum.GNU_GPLv3.name().equals(licenseOption[option][1])) {
          licenseSelected = "GNU GPLv3";
        } else {
          throw new IllegalStateException("Unexpected value: " + licenseOption[option][1]);
        }
        break;
      }
    }

    return licenseSelected;
  }
}
