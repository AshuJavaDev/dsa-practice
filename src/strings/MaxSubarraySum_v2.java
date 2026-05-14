package strings;

public class MaxSubarraySum_v2 {
    public static void main(String[] args)  {
//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] arr = {-2, -3, -1, -5, -4};
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {-1, 3, -5, 4, 6, -1, 2, -7, 3};
        int count = arr[0];
        int maxcount = arr[0];

        for(int i = 1; i<arr.length;i++)    {
            if(count + arr[i] > arr[i]) {
                count = count + arr[i];
            }       else    {
                count = arr[i];
            }
            maxcount = Math.max(count,maxcount);
        }
        System.out.println("Max sum Sub arrays is :" +maxcount);
    }
}
