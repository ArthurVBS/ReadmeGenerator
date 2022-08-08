package com.generator.readme.menu;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FeaturesMenu {
  private static void displayMenu(String title){
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_BLUE = "\u001B[34m";

    System.out.print(ANSI_GREEN + "\n-> Repo Features" + ANSI_RESET);

    System.out.println(Objects.equals(title, "add")
            ? ANSI_BLUE + " - Add Feature? [y/n]" + ANSI_RESET
            : ANSI_BLUE + " - Type a new Feature..." + ANSI_RESET);

    System.out.print(">>> ");
  }

  public static ArrayList<String> display(){
    Scanner scan = new Scanner(System.in);
    ArrayList<String> selected = new ArrayList<>();

    do {
      displayMenu("add");
      String option = scan.nextLine();

      if (Objects.equals(option, "n")){
        break;
      } else if (Objects.equals(option, "y")) {
        displayMenu("type");
        selected.add(scan.nextLine());
      }
    } while (true);

    return selected;
  }
}
