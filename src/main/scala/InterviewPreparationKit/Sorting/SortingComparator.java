package InterviewPreparationKit.Sorting;
import java.util.*;

public class SortingComparator {

    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    class Checker implements Comparator<Player> {
        // complete this method
        public int compare(Player a, Player b) {
            if(a.score != b.score) {
                return(b.score - a.score);
            }
            else
                return(a.name.compareTo(b.name));
        }
    }


}
