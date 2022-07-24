package com.generator.readme;

import com.generator.readme.templeate.Footer;
import com.generator.readme.templeate.Header;
import com.generator.readme.templeate.Main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repository {

  private String name;

  private String github;

  private ArrayList<String> badges;

  private ArrayList<String> about;

  private String status;

  private ArrayList<String> technologies;

  private ArrayList<String> features;

  private ArrayList<String> prerequisites;

  private String howToRun;

  private String license;

  private String author;

  @Override
  public String toString() {
    return Header.toSave(name, license, badges) + Main.toSave(status, license, github, howToRun) + Footer.toSave(author);
  }
}
