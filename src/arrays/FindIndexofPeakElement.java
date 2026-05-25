package arrays;

public class FindIndexofPeakElement {
        public static void main(String[] args) {

        int[] arr = {1,2,3,1};
//        int[] arr = {10, 8, 6, 4, 2};
//            int[] arr = {1, 3, 2, 5, 4};
//        int[] arr = {6, 5, 4, 3, 2, 1};

            int left = 0;
            int right = arr.length-1;
            int mid = 0;
            int result = 0;
            int temp = arr[mid];
            int mincount = Integer.MAX_VALUE;
            int index = 0;

            while(left <= right)  {
                mid = (left + right)/2;
//                left = 0;
                right = mid-1;
                if(arr[mid] > temp)   {
                    temp = arr[mid];
                    index = mid;
                }
//                mid--;
            }
            mincount = Math.min(index,mincount);

            int  secondleft = mid+1;
            right = arr.length-1;

            while(secondleft <= right)       {
                mid = (secondleft + right)/2;
//           int secondleft = mid + 1;
//            right = arr.length - 1;
                while (mid < arr.length) {
                    if (arr[mid] > temp) {
                        temp = arr[mid];
                        index = mid;
                    }
                    mid++;
                }

                secondleft = mid;
//            if(secondleft > right) break;
            }
            mincount = Math.min(index,mincount);
            System.out.println(index);
        }
    }



