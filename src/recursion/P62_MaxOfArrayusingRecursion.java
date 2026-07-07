package recursion;

public class P62_MaxOfArrayusingRecursion {
            public static void findMax(int[] arr, int index, int max)    {
            if(index == arr.length) {
                System.out.println();
                System.out.print(max);
                return;
            }
            if(arr[index] > max) {
                max = arr[index];
            }
            System.out.print(arr[index] + " ");
            findMax(arr, index+1, max);
        }


        public static void main(String[] args)    {
            int[] arr = {5, 2, 3, 4, 1};
            int index = 0;
            int max = arr[0];
            findMax(arr, index, max);
        }

    }


