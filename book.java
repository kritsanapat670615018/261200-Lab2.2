public class Book {
    String title ;
    String author;
    double price;

    Book() {
        this("Unknow title","Unknow author",0.0);
    }

    Book(String title){
        this (title,"Unknow",0.0);
    }

    Book(String title ,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println ("Title : " + this .title);
        // TODO : Complete rest of this methhod.
        System.out.println("Author: " + this.author);
        System.out.println( "Price : " + this .price);
    }

    // Update book price
    public void updatePrice(double newPrice) {
// TODO: Add validation for negative price
        if(price >=0)// INCORRECT
            this.price = newPrice;
    }
}
