package session13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Students {
    public static void main(String[] args) {
        List<String> listStudent = new ArrayList<>();
        listStudent.add("nguyen huy hoang");
        listStudent.add("nguyen ngoc bao phuc");
        listStudent.add("nguyen minh hiep");
        listStudent.add("nguyen huy thuat");
        System.out.println(listStudent);

        listStudent.add(2,"diep minh tuan");

        System.out.println("danh sach khi doi la" + listStudent);

        listStudent.remove(2);
        System.out.println("danh sach khi loai mot nguoi la" + listStudent);

        listStudent.forEach( list -> {
            System.out.println(list);
        });

        System.out.println("danh sach hoc sinh cua lop");
        Iterator<String> list = listStudent.iterator();
        while (list.hasNext()){
            String listStudent1 = list.next();
            System.out.println(listStudent1);
        }

        System.out.println("danh sach hoc sinh cua lop");
        for (int i =0 ; i< listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }


    }

}
