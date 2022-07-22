package com.generator.readme;

import com.generator.readme.enums.BadgesEnum;

import java.util.*;

public class App {

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        Repository repo = new Repository();

        final int SIZE = BadgesEnum.values().length;
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLUE = "\u001B[34m";

        String[][] badgesOption = new String[SIZE][3];
        ArrayList<String> badgesSelected = new ArrayList<>();

        for (BadgesEnum badgesEnum: BadgesEnum.values()) {
            badgesOption[badgesEnum.ordinal()][0] = String.valueOf(badgesEnum.ordinal());
            badgesOption[badgesEnum.ordinal()][1] = badgesEnum.name();
            badgesOption[badgesEnum.ordinal()][2] = "false";
        }

        int option = 0;

        while (option > -1 && option < badgesOption.length){
            for (String[] badge : badgesOption) {
                if (Objects.equals(badge[2], "true")){
                    System.out.print("[" + badge[0] + "] " + ANSI_BLUE + badge[1] + ANSI_RESET + ", ");
                } else {
                    System.out.print("[" + badge[0] + "] " + badge[1] + ", ");
                }
            }
            
            System.out.println("[-1 to exit]");

            System.out.print(">>> ");
            option = scan.nextInt();

            if (option != -1) {
                badgesOption[option][2] = "true";
                badgesSelected.add(badgesOption[option][1]);
            }
        }

        repo.setBadges(badgesSelected);

        System.out.println(repo.getBadges());
    }
}
