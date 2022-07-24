package com.generator.readme.templeate;

public class Main {

  public static String toSave(String status, String license, String github){
    String statusSection = getStatusSection(status);
    String licenseSection = getLicenseSection(license, github);

    return statusSection + licenseSection;
  }

  private static String getStatusSection(String status){
    String statusSection = "\n## \uD83D\uDCBB Project status:\n\n";
    statusSection += String.format("- %s\n", status);

    return statusSection;
  }

  private static String getLicenseSection(String license, String github){
    final String licenseURL = String.format("https://github.com/ArthurVBS/%s/blob/main/LICENSE", github);
    String licenseSection = "\n## \uD83D\uDCDD License:\n\n";
    licenseSection += String.format("- This project is licensed under the [%s](%s)\n", license, licenseURL);

    return licenseSection;
  }


}
