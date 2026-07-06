public class Main  {
    public static void main(String[] arge)
    {
        Book myBook = new Book( "Book 1"," Kritsanapat",5.0);
        //System.out.println(myBook.price);
        //System.out.println(myBook.title);
        myBook.displayDetails();
        Book ourBook = new Book ("Our Book");
        //System.out.println(ourBook.title);
        ourBook.displayDetails();
        ourBook.updatePrice(-100.0);
        ourBook.displayDetails();

        System.out.println("===================");

        //Test default constructor
        Book unknowBook = new Book();
        unknowBook.displayDetails();

        // Test parameterized constructor
        Book hp1Book = new Book ("Harry Potter and the Philosopha");
        hp1Book.displayDetails();

        // Test price update
        hp1Book.updatePrice(3200.00);
        hp1Book.displayDetails();
    }
}
