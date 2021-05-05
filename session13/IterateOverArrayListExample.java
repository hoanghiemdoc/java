package session13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();

        tvShows.add("Breaking Bad");
        tvShows.add("game of thrnes");
        tvShows.add("firend");
        tvShows.add("Prison break");

        System.out.println("== iterate using java 8 foeach and lamdba ===");
        Iterator <String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using a ListIterator() toTraverse in bot===");
        for (String tvShow: tvShows){
            System.out.println(tvShow);
        }

        System.out.println("\n === iterate using for loop with index ===");
        for (int i = 0; i<tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }

    }

}
