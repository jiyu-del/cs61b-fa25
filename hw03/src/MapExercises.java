import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Implement this method
        Map<Character, Integer> map = new HashMap<>();
        int code = 96;
        for (int i = 1; i <= 26; i++) {
            char cr = (char)(code + i);
            map.put(cr, i);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Implement this method
        Map<Integer, Integer> ntn = new HashMap<>();
        for (int num : nums) {
            ntn.put(num, (int)Math.pow(num, 2));
        }
        return ntn;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Implement this method
        Map<String, Integer> res = new HashMap<>();
        for (String word : words) {
            if (res.containsKey(word)) {
                res.put(word, res.get(word)+1);
            }else {
                res.put(word, 1);
            }
        }
        return res;
    }
}
