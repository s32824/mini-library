public class Main {
    public static void main(String[] args) {
        //Task1: Books
        Book b1 = new Book("The Witcher", "Andrzej Sapkowski", 300, true);
        Book b2 = new Book("Solaris", "Stanislaw Lem", 210, true);
        Book b3 = new Book("Dune", "Frank Herbert", 412, true);

        b1.printInfo();
        b1.borrow();
        System.out.println("After borrowing:");
        b1.printInfo();

        b1.returnBook();
        System.out.println("After returning:");
        b1.printInfo();

        b2.printInfo();
        b2.borrow();
        System.out.println("After borrowing:");
        b2.printInfo();

        b2.returnBook();
        System.out.println("After returning:");
        b2.printInfo();

        b3.printInfo();
        b3.borrow();
        System.out.println("After borrowing:");
        b3.printInfo();

        b3.returnBook();
        System.out.println("After returning:");
        b3.printInfo();

        //Task2: Readers
        Reader reader1 = new Reader("John", "Doe", "LIT-101");
        Reader reader2 = new Reader("Anna", "Smith", "LIT-102");

        reader1.increaseBorrowedCount();
        reader1.printData();
        reader2.printData();

        //Task3: Library
        Library myLibrary = new Library(5);

        Book book1 = new Book("The Witcher", "A. Sapkowski", 300, true);
        Book book2 = new Book("Solaris", "S. Lem", 200, true);
        Book book3 = new Book("Dune", "F. Herbert", 500, true);

        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);

        myLibrary.printAvailableBooks();

        System.out.println("Number of available books: " + myLibrary.countAvailableBooks());

        Book found = myLibrary.findBookByTitle("Solaris");
        if (found != null) {
            System.out.println("Found book: " + found.getTitle());
        }
    }
}