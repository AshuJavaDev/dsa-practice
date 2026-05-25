package arrays;

public class FindMinimumArray {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,1};
        int[] arr = {10, 8, 6, 4, 2}; // Expected: 2

        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        int result = 0;
        int temp = arr[mid];
        int mincount = Integer.MAX_VALUE;

        while(left <= right)  {
            mid = (left + right)/2;
            right = mid-1;
            if(arr[mid] < temp)   {
                temp = arr[mid];
            }

        }
        mincount = Math.min(temp,mincount);

        int  secondleft = mid+1;
        right = arr.length-1;

        while(secondleft <= right)       {
            mid = (secondleft + right)/2;
            while (mid < arr.length) {
                if (arr[mid] < temp) {
                    temp = arr[mid];
                }
                mid++;
            }
            secondleft = mid;

        }
        mincount = Math.min(temp,mincount);
        System.out.println(mincount);
    }
}




