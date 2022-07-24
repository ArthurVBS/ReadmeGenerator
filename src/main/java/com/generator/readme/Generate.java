package com.generator.readme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Generate {

  public static void write(Repository repo){
    final String PATH = "static/README.md";

    try {
      createLocalFolder("static");
      BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));

      writer.write(repo.toString());
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void createLocalFolder(String folderName){
    final String USER_DIR = System.getProperty("user.dir");
    final String SEPARATOR = System.getProperty("file.separator");

    File file = new File(USER_DIR + SEPARATOR + folderName);
    if (!file.exists())
      file.mkdirs();
  }
}
