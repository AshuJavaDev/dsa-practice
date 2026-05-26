package arrays;

public class CountDuplicatesBinarySearch {

        public static void main(String[] args)  {
            int[]   arr = {1,2,2,2,3,4,5};
            int target = 2;
            int left = 0;
            int right = arr.length-1;
            int mid = 0;
            int count = 0;


            int first = -1;
            while(left <= right)    {
                mid = (left+right)/2;
                if(arr[mid] == target)  {
                    first = mid;
                    right = mid-1;
                }   else if(arr[mid] > target)  {
                    right = mid-1;
                }           else    {
                    left = mid+1;
                }
            }

            int last = -1;
            left = 0;
            right = arr.length-1;
            while( left <= right)   {
                mid = (left + right)/2;
                if(arr[mid] == target)     {
                    last = mid;
                    left = mid + 1;
                }   else if(arr[mid] > target)  {
                    right = mid-1;
                }       else        {
                    left = mid+1;
                }
            }

            if(first != -1)     {
                count = last-first +1;
            }
            System.out.println(count);
        }
    }

