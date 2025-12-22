public class ArrayExercises {
    /** Returns the second to last item in the given array.
     *  Assumes the array has at least 2 elements. */
    public static String secondToLastItem(String[] items) {
        // TODO: Implement this method
        // the second to last 倒数第二个
        return items[items.length - 2];
    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        // TODO: Implement this method
        int max = items[0];
        int min = items[0];
        for (int i = 1; i < items.length; i++) {
            if (items[i] > max) max = items[i];
            if (items[i] < min) min = items[i];
        }
        return max - min;
    }

    /** Returns the given array from the second to last.
     *  Assumes the array has at least 2 elements. */
    public static String[] secondToLast(String[] items) {
        // TODO: Implement this method
        int size = items.length;
        String[] reitems = new String[size-1];
        for (int i = 0; i < size-1; i++) {
            reitems[i] = items[i+1];
        }
        return reitems;
    }

    static void main(String[] args) {
        String[] items = {"sdf", "DFSDFG", "FDSGF"};
        String result = String.join(", ", secondToLast(items));
        System.out.println(result);
        int[] y = {2, 5, 6, 6, 7, 8};
        System.out.println(minMaxDifference(y));
    }

}
