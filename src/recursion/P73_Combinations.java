package recursion;

import java.util.ArrayList;
import java.util.List;

public class P73_Combinations {

    static void combinations(int[] arr, int index, int k, List<Integer> current) {
        if (current.size() == k) {
            System.out.println(current);
            return;
        }

        if (index == arr.length) {
            return;
        }

        combinations(arr, index + 1, k, current);

        current.add(arr[index]);
        combinations(arr, index + 1, k, current);
        current.remove(current.size() - 1);

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;
        int index = 0;
        List<Integer> current = new ArrayList<>();
        combinations(arr, index, k, current);
    }
}


