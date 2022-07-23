package com.generator.readme.templeate;

public class Main {

  public static String toSave(String status, String license, String github){
    String statusSection = "\n## \uD83D\uDCBB Project status:\n\n";
    statusSection += String.format("- %s\n", status);

    final String licenseURL = String.format("https://github.com/ArthurVBS/%s/blob/main/LICENSE", github);
    String licenseSection = "\n## \uD83D\uDCDD License:\n\n";
    licenseSection += String.format("- This project is licensed under the [%s](%s)\n", license, licenseURL);

    return statusSection + licenseSection;
  }
}
