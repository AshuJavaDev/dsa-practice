package recursion;

public class P76_QuickSort {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }


        swap(arr, i + 1, high);
        return i + 1;

    }
        static void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        static void quickSort ( int[] arr, int low, int high){
            if (low >= high) return;

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }


        public static void main(String[] args)   {
            int[] arr = {5, 2, 8, 1, 9, 3};
            quickSort(arr, 0, arr.length - 1);
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }

