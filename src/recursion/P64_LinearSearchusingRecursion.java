package recursion;

public class P64_LinearSearchusingRecursion {

    public static boolean linearSearch(int[] arr, int index, int target)  {
        if(index == arr.length)  {
            return false;
        }

        if(arr[index] == target)  {
            return true;
        }

        return linearSearch(arr, index+1, target);

    }


      public static void main(String[] args)  {
          int[]  arr = {5, 2, 8, 1, 9};
          int target = 8;
          boolean result = linearSearch(arr, 0, target);
          System.out.println(result);
      }

}
