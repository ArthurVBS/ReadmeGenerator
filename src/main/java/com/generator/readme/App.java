package com.generator.readme;

import com.generator.readme.menu.*;

import java.util.ArrayList;

public class App {

    public static void main( String[] args ) {
        Repository repo = new Repository();

        // Author
        repo.setAuthor("Arthur V.B.S.");

        // Name & Title
        repo.setName(QuestionMenu.display("Name"));
        repo.setGithub(QuestionMenu.display("Github"));

        // License & About
        repo.setLicense(LicenseMenu.display());
        repo.setAbout(ListMenu.display("About"));

        // Tech & Badges
        ArrayList<String> technologies = BadgesMenu.display();
        repo.setBadges(technologies);
        repo.setTechnologies(technologies);

        // Others
        repo.setStatus(StatusMenu.display());
        repo.setFeatures(ListMenu.display("Features"));
        repo.setHowToRun(HowToRunMenu.display());

        Generate.write(repo);
    }
}
