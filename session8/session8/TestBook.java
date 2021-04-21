package hocjava.fpt.session8;

import session6.Task5.Author;
import session6.Task5.Book;

public class TestBook {
    public static void main(String[] args) {
        // we need a author instance to create a book instance
        session6.Task5.Author ahTeck = new session6.Task5.Author("Tan Ah Teck", "ahTeck@somewhere.com",'m');
        System.out.println(ahTeck);
        // tan ah teck (m) at ahTeck@someWhere.com

        // test book's constructor and toString()
        session6.Task5.Book dummyBook = new session6.Task5.Book("java for dummies",ahTeck,9.99,99);
        System.out.println(dummyBook);
        // java for dumies 'by tan ah teck (m) at ahTeck@somewhere'


        // test setters and getters
        dummyBook.setPrice((8.88));
        dummyBook.setQty(88);
        System.out.println("name is:" + dummyBook.getName());
        //name is java for dummies
        System.out.println("price is" + dummyBook.getPrice());
        // price is: 8.88

        System.out.println("qty is" + dummyBook.getQty());
        // qty is:88
        System.out.println("author is" + dummyBook.getAuthor().getName()); // invoke author toString
        // author is: tna ah teck (m) at ah teck@someWhere.com
        System.out.println("author's name is" + dummyBook.getAuthor().getEmail());

        // author 's name is tan ah teck
        System.out.println("author is email" + dummyBook.getAuthor().getEmail());
        // author email is  tanahteck@somewhere.com

        System.out.println("author gender is " + dummyBook.getAuthor().getGender());
        // author gender is:m

        // using an anoyous author instance to create a book instance
        session6.Task5.Book moreDummyBook = new Book("java for more dummies",
                new Author("peter","peter@nowhere.com",'m'),// an anoymous author
                19.99,8);
        System.out.println(moreDummyBook); // book's toString()
        // java for more dummies by peter lee(m) at peter@nowhere.com

    }

}
