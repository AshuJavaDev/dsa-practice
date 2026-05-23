package arrays;

public class FindMinimumRotatedArray {
    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        int result = -1;
        int secondleft = 0;
        int secondright = 0;
        int target = 4;
        int mincount = Integer.MAX_VALUE;
        int count = 0;

        mid = (left + right)/2;
        if(arr[mid] == target) {
            result = mid;
        }       else        {
            while(mid < arr.length-1) {
                if (arr[mid + 1] == arr[mid] + 1)    {
                    mid++;
                }   else {
                    secondright = mid;
                    secondleft = mid+1;
                    break;
                }
            }
            System.out.println("secondright : " +secondright+ " secondleft :" +secondleft);


            if(arr[secondleft] > arr[secondright])  {
                right = secondright;
                left = 0;
                while(left <= right)   {
                    count = arr[right];
                    mincount = Math.min(count,mincount);
                    right--;
                }

            }   else {
                left = secondleft;
                while(left <arr.length)  {
                    count = arr[left];
                    mincount = Math.min(count,mincount);
                    left++;
                }

            }
            System.out.println(mincount);
        }
    }
}