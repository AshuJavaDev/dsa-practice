package arrays;

public class BinarySearchTrueorFalse {
    public static void main(String[] args)  {
        int[]   arr = {1,3,5,7,9,11,13};
        int target = 6;
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        int count = 0;
        boolean isfound = false;

        while(left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                isfound = true;
                break;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (isfound) {
            System.out.println("found");
        }   else {
            System.out.println("not found");
        }

    }
}
