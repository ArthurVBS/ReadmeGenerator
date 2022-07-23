package com.generator.readme;

import com.generator.readme.menu.BadgesMenu;
import com.generator.readme.menu.StatusMenu;

public class App {

    public static void main( String[] args ) {
        Repository repo = new Repository();

        repo.setName("Login System");
        repo.setAuthor("Arthur V.B.S.");

        repo.setBadges(BadgesMenu.display());
        repo.setStatus(StatusMenu.display());

        Generate.write(repo);

        System.out.println(repo.getBadges());
        System.out.println(repo.getStatus());
    }
}
