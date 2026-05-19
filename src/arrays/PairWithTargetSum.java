package arrays;

import java.util.Arrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        Arrays.sort(arr);
        int left=0;
        int right = arr.length-1;
        int sum = 0;
        int target = 6;

        while(left<right)   {
            sum = arr[left] + arr[right];
            if(sum == target)   {
            System.out.println(left+ " " +right);
            break;
            }   else if(sum>target ) {
                    right--;
            }   else {
                left++;
            }
        }
    }
}

