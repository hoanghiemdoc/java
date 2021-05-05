package session13;

import java.util.ArrayList;
import java.util.List;

public class AcsessElementFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompaines = new ArrayList<>();

        // check if an ArrayList is empty

        System.out.println("is the topCompanies List empty?");

        topCompaines.add("google");
        topCompaines.add("apple");
        topCompaines.add("Microsoft");
        topCompaines.add("Amazon");
        topCompaines.add("Facebook");

        System.out.println("here are the top" + topCompaines.size()+ " companies in the word");
        System.out.println(topCompaines);


        String bestCompany = topCompaines.get(0);
        String secondBestCompany = topCompaines.get(1);
        String lastCompany = topCompaines.get(topCompaines.size() -1);

        System.out.println("best company:" + bestCompany);
        System.out.println("second best company" + secondBestCompany);
        System.out.println("last company in the list" + lastCompany);

        topCompaines.set(4,"walmart");
        System.out.println("modifield top companies list" + topCompaines);


    }
}
