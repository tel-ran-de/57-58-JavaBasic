package lessons.lesson4;


import lessons.lesson4.entity.Book;
import lessons.lesson4.services.BookUtil;

public class ApplicationLibrary {
    public static void main(String[] args) {

        // create book
        // read book info
        // edit book

        // ------ создать экземпляры рабочих классов ------

        BookUtil bookUtil = new BookUtil();

        // ------------------------------------------------

        Book ourFirstBook = bookUtil.createBook();

        System.out.println(ourFirstBook);


        ourFirstBook.author = "Kuper";
        ourFirstBook.name = "Last Mogikhan";
        ourFirstBook.catalogNumber = "123-ABC-888";
        ourFirstBook.pages = 257;
        ourFirstBook.isInStorage = true;

        System.out.println(ourFirstBook);


        Book ourSecondBook = bookUtil.createBookWithAuthorAndName("Vern", "Deti");
        System.out.println(ourSecondBook);

        Book ourThirddBook = bookUtil.createBookWithAllParameters("Vern", "Deti", 290, "123-ABC-999", true);
        System.out.println(ourThirddBook);



    }
}
