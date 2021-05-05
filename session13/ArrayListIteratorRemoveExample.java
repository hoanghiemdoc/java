package session13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);


        Iterator<Integer> numbersInterator = numbers.iterator();
        while (numbersInterator.hasNext()){
            Integer num = numbersInterator.next();
            if (num % 2 != 0){
                numbersInterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
