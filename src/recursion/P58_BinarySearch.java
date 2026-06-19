package recursion;

public class P58_BinarySearch {
        public static int search(int[] arr, int low, int high, int target) {
            if (low > high) return -1;
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;


            if (arr[mid] > target) {
                return search(arr, low, mid - 1, target);
            } else {
                return search(arr, mid + 1, high, target);
            }


        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9, 11};
            int low = 0;
            int high = arr.length - 1;
            int target = 7;
            int result = search(arr, low, high, target);
            System.out.println(result);
        }
    }





