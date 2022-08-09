package com.generator.readme.templeate;

import java.util.ArrayList;

public class Main {

  public static String toSave(ArrayList<String> about, String status, ArrayList<String> technologies, String license, String github, String howToRun, ArrayList<String> features){
    String aboutSection = getAboutSection(about);
    String statusSection = getStatusSection(status);
    String technologiesSection = getTechnologiesSection(technologies);
    String featuresSection = getFeaturesSection(features);
    String howToRunSection = getHowToRunSection(howToRun, github);
    String licenseSection = getLicenseSection(license, github);

    return aboutSection + statusSection
            + technologiesSection + featuresSection
            + howToRunSection + licenseSection;
  }

  private static String getAboutSection(ArrayList<String> about){
    StringBuilder aboutSection = new StringBuilder("\n## ✨ About the project:\n\n");
    for (String abt : about){
      aboutSection.append(String.format("- %s\n", abt));
    }

    return aboutSection.toString();
  }

  private static String getStatusSection(String status){
    String statusSection = "\n## \uD83D\uDCBB Project status:\n\n";
    statusSection += String.format("- %s\n", status);

    return statusSection;
  }

  private static String getTechnologiesSection(ArrayList<String> technologies){
    StringBuilder technologiesSection = new StringBuilder("\n## \uD83D\uDEE0 Technologies:\n\n");
    for (String tech : technologies){
      technologiesSection.append(String.format("- %s\n", tech));
    }

    return technologiesSection.toString();
  }

  private static String getFeaturesSection(ArrayList<String> features) {
    StringBuilder featuresSection = new StringBuilder("\n## \uD83D\uDCDD Features:\n\n");
    for (String feature : features) {
      featuresSection.append(String.format("- %s\n", feature));
    }

    return featuresSection.toString();
  }

  private static String getLicenseSection(String license, String github){
    final String licenseURL = String.format("https://github.com/ArthurVBS/%s/blob/main/LICENSE", github);
    String licenseSection = "\n## \uD83D\uDCDD License:\n\n";
    licenseSection += String.format("- This project is licensed under the [%s](%s)\n", license, licenseURL);

    return licenseSection;
  }

  private static String getHowToRunSection(String howToRun, String github){
    String toReturn = "\n## \uD83D\uDE80 How to run the application?\n\n";
    toReturn += getHowToRunCommands(howToRun, github);

    return toReturn;
  }

  private static String getHowToRunCommands(String howToRun, String github){
    final String appURL = String.format("https://arthurvbs.github.io/%s/", github);

    String viteAppCommands = String.format(
        """
        -  Go to the [application website](%s)
        
          `or`
          
        - 💻 Download the ZIP or Clone the application on your machine;
          - Open a CMD in the root of the project folder,
          - Install node/react modules: `npm install`,
          - Finally, start a localhost: `npm run dev`.
        """
        , appURL);

    String createReactAppCommands = String.format(
        """
        -  Go to the [application website](%s)
        
          `or`
          
        - 💻 Download the ZIP or Clone the application on your machine;
          - Open a CMD in the root of the project folder,
          - Install node/react modules: `npm install`,
          - Finally, start a localhost: `npm start`.
        """
        , appURL);


    String springAppCommands =
        """
        - 💻 Download the ZIP or Clone the application on your machine;
          - Create your database with your username and password,
          - Change the database settings in `application-test.properties`,
          - Open a CMD in the root of the project folder,
          - Start the Spring project with Maven: `mvn spring-boot:run`.
        """;

    String mavenAppCommands =
        """
        - 💻 Download the ZIP or Clone the application on your machine;
          - Open a CMD in the root of the project folder,
          - Start the Maven app: `???`.
        """;

    String viteSpringAppCommands = String.format(
        """
        -  Go to the [application website](%s)
        
          `or`
          
        - 💻 Download the ZIP or Clone the application on your machine;
        - 🎨 Frontend
          - Open CMD and navigate to 'frontend' folder: `cd frontend`,
          - Install node/react modules: `npm install`,
          - Finally, start a localhost: `npm run dev`.
        - 🎲 Backend
          - Create your database with your username and password,
          - Change the database settings in `application-test.properties`,
          - Open another CMD in the root of the project folder,
          - Navigate to 'backend' folder: `cd backend`,
          - Start the Spring project with Maven: `mvn spring-boot:run`.
        """
        , appURL);

    String vanillaJSAppCommands = String.format(
        """
         -  Go to the [application website](%s)
         
           `or`
           
         - 💻 Download the ZIP or Clone the application on your machine;
           - Open the folder and double click on `index.html`.
         """
    , appURL);

    return switch (howToRun){
      case "VITE_APP" -> viteAppCommands;
      case "CREATE_REACT_APP" -> createReactAppCommands;
      case "SPRING_APP" -> springAppCommands;
      case "MAVEN_APP" -> mavenAppCommands;
      case "VITE_SPRING_APP" -> viteSpringAppCommands;
      case "VANILLA_JS_APP" -> vanillaJSAppCommands;
      default -> "";
    };
  }
}
