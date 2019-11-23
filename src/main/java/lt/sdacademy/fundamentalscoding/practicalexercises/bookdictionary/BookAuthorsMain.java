package lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary;

import lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary.model.Book;

import java.util.List;

import static lt.sdacademy.fundamentalscoding.practicalexercises.bookdictionary.util.BookParser.getBooksList;

public class BookAuthorsMain {

    public static void main(String[] args) {

        List<Book> bookList = getBooksList();
        //List<AuthorsList> authorsList = getAuthorsList();
         //System.out.println(bookList.get(0));
        //System.out.println(bookList.get(1));

       // bookList.forEach(data -> System.out.println(data));
        for(Book book : bookList){
            System.out.println(book.getAuthorsList());
            System.out.println(book.getTitle());
            System.out.println(book);
        }

        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }

        bookList.stream().parallel().forEach(book -> System.out.println(book));
    }





}
