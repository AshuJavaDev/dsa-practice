public class SearchRotatedArray {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int left = 0;
        int right = arr.length - 1;
        int target = 0;
        int mid = 0;
        int result = -1;
        int secondleft = 0;
        int secondright = 0;

        mid = (left + right) / 2;

        if (arr[mid] == target) {
            result = mid;
        } else {
            while (mid < arr.length - 1) {
                if (arr[mid + 1] == arr[mid] + 1) {
                    mid++;
                } else {
                    secondleft = mid + 1;
                    secondright = mid;
                    break;
                }
            }
            System.out.println("Second Left : " + secondleft + "  Second Right : " + secondright);

            if (target >= arr[0]) {
                left = 0;
                right = secondright;
            } else {
                left = secondleft;
            }

            while (left <= right) {
                mid = (left + right) / 2;

                if (arr[mid] == target) {
                    result = mid;
                    break;
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        System.out.println("Index of target is: " + result);
    }
}