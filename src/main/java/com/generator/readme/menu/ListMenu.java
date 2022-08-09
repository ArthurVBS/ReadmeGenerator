package com.generator.readme.menu;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ListMenu {
  private static void displayMenu(String title, String question){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_BLUE = "\u001B[34m";

    System.out.printf(ANSI_GREEN + "\n-> Repo %s" + ANSI_RESET, question);

    System.out.println(Objects.equals(title, "add")
            ? String.format(ANSI_BLUE + " - Add %s? [y/n]" + ANSI_RESET, question)
            : String.format(ANSI_BLUE + " - Type a new %s..." + ANSI_RESET, question));

    System.out.print(">>> ");
  }

  public static ArrayList<String> display(String question){
    Scanner scan = new Scanner(System.in);
    ArrayList<String> selected = new ArrayList<>();

    do {
      displayMenu("add", question);
      String option = scan.nextLine();

      if (Objects.equals(option, "n")){
        break;
      } else if (Objects.equals(option, "y")) {
        displayMenu("type", question);
        selected.add(scan.nextLine());
      }
    } while (true);

    return selected;
  }
}
