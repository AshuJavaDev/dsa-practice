package arrays;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int count = 0;
        int product = 1;
        int maxcount = 0;
        int i = 0;

        while (count < arr.length) {
//                product=1;
            while (i < arr.length) {
                product = arr[i] * product;
                i++;
                maxcount = Math.max(product, maxcount);
            }

            count++;
            i = count;
            product = 1;
        }
            System.out.println(maxcount);
    }
}