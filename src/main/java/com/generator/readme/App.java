package com.generator.readme;

import com.generator.readme.menu.*;

public class App {

    public static void main( String[] args ) {
        Repository repo = new Repository();

        repo.setAuthor("Arthur V.B.S.");

        repo.setName(QuestionMenu.display("Name"));
        repo.setGithub(QuestionMenu.display("Github"));
        repo.setLicense(LicenseMenu.display());
        repo.setBadges(BadgesMenu.display());
        repo.setStatus(StatusMenu.display());
        repo.setFeatures(FeaturesMenu.display());
        repo.setHowToRun(HowToRunMenu.display());

        Generate.write(repo);
    }
}
