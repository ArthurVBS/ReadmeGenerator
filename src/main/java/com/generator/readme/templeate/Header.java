package com.generator.readme.templeate;

import java.util.ArrayList;

public class Header {

  public static String toSave(String name, ArrayList<String> badges){
    String toReturn = String.format("<h1 align=\"center\">%s</h1> \n", name);

    toReturn += "Hi, there";

    return toReturn;
  }
}
