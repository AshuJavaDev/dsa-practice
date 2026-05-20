public class FirstAndLastPosition    {

    // Find FIRST position
    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                result = mid;      // save this position
                right = mid - 1;   // but keep searching LEFT!
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Find LAST position
    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                result = mid;     // save this position
                left = mid + 1;   // but keep searching RIGHT!
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args)  {
        int[] arr = {1,3,5,5,5,7,9};
        int target = 5;

        System.out.println("First position: " + findFirst(arr, target));
        System.out.println("Last position: " + findLast(arr, target));


    }
}