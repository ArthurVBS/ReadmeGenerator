package com.generator.readme.templeate;

public class Footer {

  public static String toSave(String author){

    final String emoji = "\uD83D\uDC68\uD83C\uDFFD\u200D\uD83D\uDCBB";
    final String imageURL = "https://avatars.githubusercontent.com/u/84406367?v=4";
    final String githubURL = "https://github.com/ArthurVBS";

    String toReturn = String.format("\n<h2 align=\"center\">%s Author</h2>\n", emoji);
    toReturn += "\n<div align=\"center\">";
    toReturn += String.format("\n<img width=\"100px;\" src=\"%s\" alt=\"Author's photo\"/>", imageURL);
    toReturn += String.format("\n<br><span>Made by <a href=\"%s\" target=\"_blank\" rel=\"external\">%s</a>✌\uD83C\uDFFD</span>", githubURL, author);
    toReturn += "\n</div>\n";

    return toReturn;
  }
}
