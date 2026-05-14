package strings;

public class MaxSubarraySum {
    public static void main(String[] args) {
//    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] arr = {-2, -3, -1, -5, -4};
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] arr = {1, 2, 3, 4, 5};

        int count = arr[0];
        int maxcount = arr[0];

        for (int i = 1; i < arr.length; i++) {
            count = Math.max(arr[i], count + arr[i]);
            maxcount = Math.max(maxcount, count);
        }
        System.out.println("maxcount is : " +maxcount);
    }
}
