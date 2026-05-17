package arrays;

public class MaxSumSubarrayK {
    public static void main(String[] args)  {

        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k =4;
        int left = 0;
        int sum = 0;
        int maxcount = 0;

        for(int right = k-1; right <arr.length; right++)    {

                if(left==0)  {
                for(int i = 0; i<= k-1; i++) {
                sum += arr[i];
            }
                left++;

                } else  {
                    sum = sum - arr[left-1] + arr[right];
                    left++;
                }
                    maxcount = Math.max(maxcount,sum);
        }
                    System.out.println(maxcount);
    }
}


