package com.generator.readme;

import com.generator.readme.menu.BadgesMenu;

public class App {

    public static void main( String[] args ) {
        Repository repo = new Repository();

        repo.setBadges(BadgesMenu.display());
        repo.setName("Login System");

        Generate.write(repo);

        System.out.println(repo.getBadges());
    }
}
