package session13;

import java.util.ArrayList;
import java.util.List;


public class CreateArrayListExample {

    public static void main(String[] args) {
        // creating an arrayList of string
        List<String> animals = new ArrayList();

        // adding new elements to the arrayList
        animals.add("lion");
        animals.add("tiger");
        animals.add("cat");
        animals.add("dog");

        System.out.println(animals);

        animals.add(2,"elephant");

        System.out.println(animals);


    }

}
