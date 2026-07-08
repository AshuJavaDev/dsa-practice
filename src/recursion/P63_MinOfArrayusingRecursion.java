package recursion;

public class P63_MinOfArrayusingRecursion {
    public static int findMin(int[] arr, int index)  {
        if(index == arr.length-1) {

            return arr[index];
        }

        int minOfRest = findMin(arr, index + 1);

        if(arr[index] < minOfRest) {
            return arr[index];
        }   else  {
            return minOfRest;
        }

    }

    public static void main(String[] args)  {
        int[] arr = {5, 2, 3, 4, 1};
        int index = 0;
        int result = findMin(arr, index);
        System.out.println(result);
    }
}
