import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Implement this method
        int res = 0;
        for (int i = 0; i < L.size(); i++) {
            res += L.get(i);
        }
        return res;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Implement this method
        List<Integer> res = new ArrayList<>();
        for (int num : L) {
            if (num % 2 == 0) res.add(num);
        }
        return res;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Implement this method
        Set<Integer> set2 = new HashSet<>(L2);
        Set<Integer> res = new HashSet<>();
        for (Integer num : L1) {
            if (set2.contains(num)) {
                res.add(num);
            }
        }
        return new ArrayList<>(res);
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        // TODO: Implement this method
        int count = 0;
        for (String word : words) {
            if (word.equals(w)) count++;
        }
        return count;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Implement this method
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) count++;
            }
        }
        return count;
    }
}
