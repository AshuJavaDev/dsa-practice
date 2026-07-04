package recursion;

public class P61_SumofArrayusingRecursion {
  public static void sum(int[] arr, int index, int total)    {
      if(index == arr.length) {
          System.out.println();
          System.out.print(total);
          return;
      }
      System.out.print(arr[index] + " ");
      sum(arr, index+1, total + arr[index]);
  }


  public static void main(String[] args)    {
      int[] arr = {5, 2, 3, 4, 1};
      int index = 0;
      int total = 0;
      sum(arr, index, total);
  }

}
