package recursion;

public class P75_MergeSort {
     static void mergeSort(int[] arr, int left, int right) {
         if (left >= right) return;
         int mid = (left + right) / 2;

         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);
         merge(arr, left, mid, right);

      }

     static void merge(int[] arr, int left, int mid, int right)  {
         int[] leftArr = new int[mid-left+1];
         int[] rightArr = new int[right-mid];

         for(int i =0; i<leftArr.length; i++)  {
             leftArr[i] = arr[left+i];
         }

         for(int j = 0; j<rightArr.length; j++) {
             rightArr[j] = arr[mid+1+j];
         }

         int i = 0, j = 0, k = left;

         while(i<leftArr.length && j<rightArr.length)  {
             if(leftArr[i] <= rightArr[j])  {
                 arr[k] = leftArr[i];
                 i++;
             }      else    {
                 arr[k] = rightArr[j];
                 j++;
             }
                k++;
         }

         while(i<leftArr.length)  {
             arr[k] = leftArr[i];
             i++;
             k++;
         }

         while(j<rightArr.length)  {
             arr[k] = rightArr[j];
             j++;
             k++;
         }
     }

     public static void main(String[] args)  {
         int[] arr = {2,5,1,3};
         int left = 0;
         int right = arr.length-1;

         mergeSort(arr, left, right);
         for(int x : arr) System.out.print(x + " ");
     }
}
