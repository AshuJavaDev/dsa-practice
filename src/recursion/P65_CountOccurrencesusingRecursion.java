package recursion;

public class P65_CountOccurrencesusingRecursion {
 public static int countOccurance(int[] arr, int index, int target)  {
     if(index == arr.length)  {
         return 0;
     }

     int countInRest = countOccurance(arr, index + 1, target);

     if(arr[index] == target) {
         return 1 + countInRest;
     }   else   {
         return 0 + countInRest;
     }
 }

    public static void main(String[] args)  {
       int[] arr = {2,5,2,8,2,2};
       int target = 2;
       int result = countOccurance(arr,0,target);
        System.out.println(result);
    }

}
