package recursion;
import java.util.Arrays;

public class P60ReverseArray {
    public static void reverse(int[] input, int left, int right) {

        if (left >= right) return;
        if (left <= right) {
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            reverse(input, left + 1, right - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 1};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }
}
