package recursion;

public class P66_FirstOccurrence {
    public static int firstOccurrence(int[] arr, int index, int target)  {

        if(index == arr.length)  {
            return -1;
        }


        if(arr[index] == target)  {
            return index;
        }

        return firstOccurrence(arr, index+1, target);


    }

    public static void main(String[] args)   {
        int[] arr =  {4, 3, 7, 2, 9};
        int target = 2;
        int result = firstOccurrence(arr, 0, target);
        System.out.println(result);
    }
}
