public class Reader {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, String cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = 0;
    }

    public void printData() {
        System.out.println("Reader: " + firstName + " " + lastName + " | Card: " + cardNumber + " | Borrowed: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        this.borrowedCount++;
    }

    public void decreaseBorrowedCount() {
        if (this.borrowedCount > 0) {
            this.borrowedCount--;
        }
    }
}