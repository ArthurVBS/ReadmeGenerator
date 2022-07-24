package com.generator.readme.templeate;

import java.util.ArrayList;

public class Header {

  public static String toSave(String name, String license, ArrayList<String> badges){
    String titleSection = getTitleSection(name);
    String badgesSection = getBadgesSection(license, badges);

    return titleSection + badgesSection;
  }

  private static String getTitleSection(String name){
    return String.format("<h1 align=\"center\">%s</h1> \n", name);
  }

  private static String getBadgesSection(String license, ArrayList<String> badges){
    // Example: <img src="https://img.shields.io/badge/GitHub-000?style=social&logoColor=469BD2&logo=github">

    final String badgeURL = "https://img.shields.io/badge/";
    final String badgeStyle = "?style=social&logoColor=469BD2";

    final String licenseBadge = String.format("<img src=\"%sLicense-%s-000%s&logo=json\">", badgeURL, license, badgeStyle);
    final String githubBadge = String.format("<img src=\"%sGitHub-000%s&logo=github\">", badgeURL, badgeStyle);

    StringBuilder toReturn = new StringBuilder("\n<div align=\"center\">");
    toReturn.append("\n").append(licenseBadge).append("&nbsp;");
    toReturn.append("\n").append(githubBadge).append("&nbsp;");

    for (String badge : badges) {
      String badgeLogo = getBadgesLogo(badge);
      toReturn.append(String.format("\n<img src=\"%s%s-000%s&logo=%s\">", badgeURL, badge, badgeStyle, badgeLogo));
      toReturn.append("&nbsp;");
    }

    toReturn.append("\n</div>\n");

    return toReturn.toString();
  }

  private static String getBadgesLogo(String badge){
    return switch (badge) {
      case ("Java") -> "openjdk";
      case ("HTML") -> "html5";
      case ("CSS") -> "css3";
      default -> badge;
    };
  }
}
