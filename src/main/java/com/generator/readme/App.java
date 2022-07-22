package com.generator.readme;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        Repository repo = new Repository();

        System.out.println("Hello World!");

        System.out.println("Repo Name: ");
        repo.setName(scan.nextLine());

        System.out.println("Repo Author: ");
        repo.setAuthor(scan.nextLine());

        System.out.println(repo);
    }
}
