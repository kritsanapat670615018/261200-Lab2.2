public class Book {

    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Unknown Title", "Unknown Author", 1.0);
    }

    // Constructor with title only
    public Book(String title) {
        this(title, "Unknown Author", 1.0);
    }

    // Constructor with all fields
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;

        // Price must be greater than 0
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1.0;
        }
    }

    // Display book information
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Update book price
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price!");
        }
    }

    // Apply discount
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price = price - (price * percent / 100);
        } else {
            System.out.println("Invalid discount!");
        }
    }
}
