import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {

        Library library1 = new Library();

        //Fill the library with new editions (books and magazines)
        library1.registerEdition();

         //Borrow a book which is available
         library1.borrowBook("Skipping Christmas");

         //Try to borrow a book which is not available
         library1.borrowBook("Skipping Christmas");

       //Borrow a magazine which is available
        library1.borrowMagazine("PC Today");

       //Try to borrow a magazine which is not available
        library1.borrowMagazine("PC Today");

       //Return a magazine
        library1.getBackMagazine("PC Today");

       //Try to return a magazine which hasn't been borrowed
        library1.getBackMagazine("PC Today");

        //Show all books and their availability
         library1.showAllBooks();

         //Show all magazines and their availability
         library1.showAllMagazines();

    }
}





































//

//
////        List<String> bookList = new ArrayList<>();
////        List<Magazine> magazineList = new ArrayList<>();
//
//        while(s.hasNext()) {
//            bookList.add(s.next());
//        }
//
//        System.out.println(bookList);
//
//
//    }
//
//    public void lendEdition() {
//
//    }
//
//    public void returnEdition() {
//
//    }
//}









