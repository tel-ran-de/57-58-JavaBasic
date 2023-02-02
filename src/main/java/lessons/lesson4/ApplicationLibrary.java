package lessons.lesson4;


import lessons.lesson4.entity.Book;
import lessons.lesson4.services.BookUtil;
import lessons.lesson4.services.UserInput;

public class ApplicationLibrary {
    public static void main(String[] args) {

        // create book
        // read book info
        // edit book

        // ------ создать экземпляры рабочих классов ------

        BookUtil bookUtil = new BookUtil();
        UserInput userInput = new UserInput();

        // ------------------------------------------------

        Book ourFirstBook = bookUtil.createBook();

        System.out.println(ourFirstBook);
        System.out.println("--------------");


        ourFirstBook.setAuthor("Kuper");
        ourFirstBook.setName("Last Mogikhan");
        ourFirstBook.setCatalogNumber( "123-ABC-888");
        ourFirstBook.setPages(257);
        ourFirstBook.setInStorage(true);

        System.out.println(ourFirstBook);


        Book ourSecondBook = bookUtil.createBookWithAuthorAndName("Vern", "Deti");
        ourSecondBook.setPages(340);
        ourSecondBook.setCatalogNumber("123-ABC-456");
        ourSecondBook.setInStorage(true);

        System.out.println(ourSecondBook);

        Book ourThirddBook = bookUtil.createBookWithAllParameters("Mark Twen", "Tom Soyer", 390, "123-ABC-123", true);
        System.out.println(ourThirddBook);


        String newBookAuthor = userInput.stringInput("Please enter new book author ");
        String newBookName = userInput.stringInput("Please enter new book name ");
        int newBookPages = userInput.integerInput("Please enter new book pages ");
        String newBookCatalogNumber = userInput.stringInput("Please enter new book catalog number ");
        boolean newBookisPresent = userInput.booleanInput("Is book in the storage (true/false)? ");

        Book ourNextBook =
                bookUtil.createBookWithAllParameters(newBookAuthor,newBookName,newBookPages,newBookCatalogNumber, newBookisPresent);

        System.out.println(ourNextBook);

        bookUtil.editBookCatalogNumber(ourThirddBook,"123-ABC-631");
        System.out.println(ourThirddBook);
    }
}
