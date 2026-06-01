package arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> input = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (input.containsKey(diff)) {
                System.out.println(arr[i] + " " + diff);
            } else {
                input.put(arr[i], i);
            }
        }
    }


}
