package com.generator.readme;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Generate {

  public static void write(Repository repo){
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("README.md"));
      writer.write(repo.toString());
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
