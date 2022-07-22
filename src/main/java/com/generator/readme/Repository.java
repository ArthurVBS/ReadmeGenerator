package com.generator.readme;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repository {

  private String name;

  private String author;

  @Override
  public String toString() {
    return "Repository{" +
        "name='" + name + '\'' +
        ", author='" + author + '\'' +
        '}';
  }
}
