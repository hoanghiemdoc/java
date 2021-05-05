package session13;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguage  = new ArrayList<>();
        programmingLanguage.add("c");
        programmingLanguage.add("c++");
        programmingLanguage.add("java");
        programmingLanguage.add("Koltin");
        programmingLanguage.add("Perl");
        programmingLanguage.add("Ruby");

        System.out.println("initial list" + programmingLanguage);

        // remove the element at index 5
        programmingLanguage.remove(5);
        System.out.println("after remove(5)" + programmingLanguage);

        // remove the first occurnce of the given element form the array
        // the remove() method return false if the element does not exit

        boolean isRemoved = programmingLanguage.remove("kottlin");
        System.out.println("after remove(\"kotlin\")"+programmingLanguage);

        // remove all the element that exits n a given collection

        List<String> scriptingLangues = new ArrayList<>();
        scriptingLangues.add("python");
        scriptingLangues.add("ruby");
        scriptingLangues.add("perl");

        programmingLanguage.removeAll(scriptingLangues);
        System.out.println("after removeAll(scriptingluauages):"+ programmingLanguage);

        // remove all elements that satisfy

        programmingLanguage.removeIf(n ->(n.charAt(0) == 'T'));

        System.out.println("after removinf all elemnt that stars with \"C\":" + programmingLanguage);

        programmingLanguage.clear();
        System.out.println("after()" + programmingLanguage);

    }


}
