package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        HashMap<Integer, Integer> input = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (input.containsKey(arr[i])) {
                input.put(arr[i], input.get(arr[i]) + 1);
            } else {
                input.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> value : input.entrySet()) {
            if (value.getValue() > 1) {
                System.out.println("Number = " + value.getKey() + " Frequency of Number " + value.getValue());
            }
        }
    }
}



