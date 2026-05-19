import java.util.Arrays;

public class BinarySearch    {
    public static void main(String[] args)  {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45};
        int target = 23;
        int mid = 0;
        int left =0;
        int right = arr.length-1;
        Arrays.sort(arr);

        while(left <= right)   {
            mid = (left + right)/2;

            if(arr[mid] == target)   {
                System.out.println("found at Index: " +mid);
                return;
            }  else if(arr[mid] > target) {
                right = mid-1;
            }   else    {
                left = mid+1;
            }
        }

    }

}
