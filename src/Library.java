import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Library {

    List<Book> bookEditions = new ArrayList<>();
    List<Magazine> magazineEditions = new ArrayList<>();

    public void registerEdition() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Seeburger_task/../new_edition.csv"));

        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null) {
            String[] line = sCurrentLine.split(";");

            if (line[0].equals("B")) {
                bookEditions.add(new Book(line[1], line[2]));
            }

            if (line[0].equals("M")) {
                magazineEditions.add(new Magazine(line[1], (line[2])));
            }
        }
    }

    public void borrowMagazine(String name) {

        for (Magazine curMagazine : magazineEditions) {
            if (curMagazine.getName().equals(name) && curMagazine.isAvailable) {
                System.out.println("You have successfully borrowed " + name);
                curMagazine.isAvailable = false;
            } else if (curMagazine.getName().equals(name) && (!curMagazine.isAvailable)) {
                System.out.println("Sorry, the magazine " + name + " is already borrowed!");
            }
        }
    }


    public void borrowBook(String name) {

        for (Book curBook : bookEditions) {

            int available = 0;
            int unavailable = 0;

            if (curBook.getName().equals(name) && curBook.isAvailable) {
                curBook.isAvailable = false;
                System.out.println("You have successfully borrowed: " + name);

            } else if (curBook.getName().equals(name) && (!curBook.isAvailable)) {
                System.out.println("Sorry, the book " + name + " is already borrowed!");

            }
        }
    }

    public void getBackBook(String name) {

        for (Book curBook : bookEditions) {

            if (curBook.getName().equals(name) && (!curBook.isAvailable)) {
                curBook.isAvailable = true;
                System.out.println("You have successfully returned: " + name);

            } else if (curBook.getName().equals(name) && curBook.isAvailable) {
                System.out.println("The book " + name + " was already returned!");
            }
        }
    }

    public void getBackMagazine(String name) {

        for (Magazine curMagazine : magazineEditions) {

            if (curMagazine.getName().equals(name) && (!curMagazine.isAvailable)) {
                curMagazine.isAvailable = true;
                System.out.println("You have successfully returned " + name);

            } else if (curMagazine.getName().equals(name) && curMagazine.isAvailable) {
                System.out.println("The magazine " + name + " was already returned!");

            }
        }
    }

    public void showAllBooks() {

        int availableBooks = 0;
        int unavailableBooks = 0;

        for (Book curBook: bookEditions) {
            if (curBook.isAvailable){
                availableBooks++;
            }
            System.out.println(curBook);

            if (!curBook.isAvailable){
                unavailableBooks++;
            }
        }
        System.out.println("Currently we have" + " " + availableBooks + " " + "books available");
        System.out.println("Currently we have" + " " + unavailableBooks + " " + "book unavailable");
    }

    public void showAllMagazines() {

        int availableMagazines = 0;
        int unavailableMagazines = 0;

        for (Magazine curMagazine: magazineEditions) {
            if (curMagazine.isAvailable){
                availableMagazines++;
            }
            System.out.println(curMagazine);

            if (!curMagazine.isAvailable){
                unavailableMagazines++;
            }
        }
        System.out.println("Currently we have" + " " + availableMagazines + " " + "magazines available");
        System.out.println("Currently we have" + " " + unavailableMagazines + " " + "magazines unavailable");
    }
}














