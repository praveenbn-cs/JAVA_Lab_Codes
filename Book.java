
class Book {
    int bookID;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

    // Constructor
    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    // Display book information
    void display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println("-------------------------");
    }

    // Search by Book ID
    void search(int id) {
        if (bookID == id) {
            System.out.println("Book found by ID:");
            display();
        }
    }

    // Overloaded search by Title
    void search(String title) {
        if (this.title.equalsIgnoreCase(title)) {
            System.out.println("Book found by Title:");
            display();
        }
    }

    // Return the costlier book
    Book costlier(Book b) {
        if (this.price >= b.price) {
            return this;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", "James Gosling", 500);
        Book b2 = new Book(102, "Python", "Guido Rossum", 700);
        Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 400);

        System.out.println("All Book Details:");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("Searching by Book ID:");
        b1.search(101);

        System.out.println("Searching by Title:");
        b2.search("Python");

        Book expensive = b1.costlier(b2);
        System.out.println("Costlier Book:");
        expensive.display();

        System.out.println("Total Books Created: " + Book.totalBooks);
    }
}
