package com.generator.readme.templeate;

public class Footer {

  public static String toSave(String author){

    final String emoji = "\uD83D\uDC68\uD83C\uDFFD\u200D\uD83D\uDCBB";

    String toReturn = String.format("<h2 align=\"center\">%s Author</h2>\n", emoji);
    toReturn += "\n<div align=\"center\">";
    toReturn += "\n<img width=\"100px;\" src=\"https://avatars.githubusercontent.com/u/84406367?v=4\" alt=\"Author's photo\"/>";
    toReturn += String.format("\n<br><span>Made by <a href=\"https://github.com/ArthurVBS\" target=\"_blank\" rel=\"external\">%s</a>✌\uD83C\uDFFD</span>", author);
    toReturn += "\n</div>";

    return toReturn;
  }
}
