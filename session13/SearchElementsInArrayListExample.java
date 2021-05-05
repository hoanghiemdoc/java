package session13;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("bob");
        names.add("maria");
        names.add("steve");

        // check if an arrayList container a given element
        System.out.println("does names array contain\"Bob\"?:"+names.contains("bob"));


        // find the index of the last occurnce of an element in an arrayList

        System.out.println("IndexOf \"john\":" + names.indexOf("john"));
        System.out.println("IndexOf \"alice\":" + names.indexOf("alice"));

//        find the last array list
        System.out.println("LastIndexOf \"steve\":" + names.indexOf("steve"));
        System.out.println("LastIndexOf \"maria\":" + names.indexOf("Maria"));

    }

}
