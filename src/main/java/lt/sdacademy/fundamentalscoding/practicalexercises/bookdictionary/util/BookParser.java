package lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary.util;

import lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary.model.Book;
import lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary.model.BookAuthor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookParser {

    private static final String FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\book_author\\BooksData.txt";

    // getBooksList -> mapDataObject -> authorsListObject -> authorsListDataObject
    // Books
    public static List<Book> getBooksList() {
        List<Book> bookList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = "";
            while (line != null) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                bookList.add(mapDataObject(line.split(";")));
            }
        } catch (IOException e) {
            System.out.println("Ivyko klaida!");
        }
        return bookList;
    }

    /**
     * Creates Book object
     * @param booksData
     * @return Book object
     */
    private static Book mapDataObject(String[] booksData) {
        return new Book(booksData[0], authorsListObject(booksData[1]), Integer.parseInt(booksData[2]), Integer.parseInt(booksData[3]));
    }

    // Authors
    private static List<BookAuthor> authorsListObject(String authorData) {
        List<BookAuthor> authorsList = new ArrayList<>();
        //authorData = Autoriaus vardas1,email1,8885857738-Autoriaus vardas2,email1,8885857738;
        String[] splitedAuthorsData = authorData.split("-");
        // splitedAuthorsData[0] = Autoriaus vardas1,email1,8885857738
        //splitedAuthorsData[1] = Autoriaus vardas2,email1,8885857738;
        for(String aData: splitedAuthorsData) {
            authorsList.add(authorsListDataObject(aData));
        }
        return authorsList;
    }

    private static BookAuthor authorsListDataObject(String authorsdata) {
        List<BookAuthor> firstAuthorList = new ArrayList<>();
        //authorsdata =  Autoriaus vardas1,email1,8885857738
        String[] splittedFirstAuthor = authorsdata.split(",");
        // splittedFirstAuthor[0] = Autoriaus vardas1
        // splittedFirstAuthor[1] = email1
        // splittedFirstAuthor[2] = 8885857738
        return new BookAuthor(splittedFirstAuthor[0], splittedFirstAuthor[1], splittedFirstAuthor[2]);
    }
}
