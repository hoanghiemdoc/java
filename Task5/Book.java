package session6.Task5;

public class Book {
    // the private instance variables

    private String name;
    private Author author;
    private double price;
    private int  qty;


    // constructs a book instance with the given author

    public Book(String name, Author author, double price,int qty){
        this.name = name;
        this.author =author;
        this.price = price;
        this.qty = qty;

    }
    // getters and setters
    // return the name of this book
    public String getName(){
        return name;
    }
  // return the author instance of this book
    public Author getAuthor(){
        return author; // return member author,which is an instace of the class author

    }
    public double getPrice(){
        return price;
    }

    // sets the price

    public void setPrice(double price){
        this.price = price;
    }

    // return int getQTY()
    public int getQty(){
        return qty;
    }

    // sets the quantity
    public void setQty(int qty) {
        this.qty = qty;
    }

    // return a self-descriptive String
    public String toString(){
        return "'"+name+"'by " + author; // author.toString()
    }



}
