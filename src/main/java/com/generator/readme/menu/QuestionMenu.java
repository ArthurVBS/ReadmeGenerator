package com.generator.readme.menu;

import java.util.Scanner;

public class QuestionMenu {
  public static String display(String question){
    Scanner scan = new Scanner(System.in);

    displayTitle(question);

    return scan.nextLine();
  }

  private static void displayTitle(String question){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";

    System.out.printf(ANSI_GREEN + "\n-> Repo %s?\n" + ANSI_RESET, question);
    System.out.print(">>> ");
  }
}
