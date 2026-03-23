public class Library {
    //An array of Book objects and a counter
    private Book[] books;
    private int bookCount;

    //Initializes the array with a maximum size (capacity)
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    //Adds a book to the array and increments the counter
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    // Uses a loop to print only available books
    public void printAvailableBooks() {
        System.out.println("--- Available Books in Library ---");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }

    //Searches for a book by its title
    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // Return null if not found
    }

    //Returns the total number of available items
    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }
}