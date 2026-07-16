public class Main {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.displayDetails();

        System.out.println();

        Book book2 = new Book("Java Programming");
        book2.displayDetails();

        System.out.println();

        Book book3 = new Book("Java Programming", "James Gosling", 500);
        book3.displayDetails();

        System.out.println();

        book3.updatePrice(450);
        System.out.println("After updating price:");
        book3.displayDetails();

        System.out.println();

        book3.applyDiscount(10);
        System.out.println("After 10% discount:");
        book3.displayDetails();
    }
}
