package recursion;

public class P67_LastOccurrenceOfElement {
    public static int lastOccurence(int[] arr, int index, int target) {

        if(arr[index] == target)  {
            return index;
        }

        if(index <= 0)  {   // if(index == 0) will  work,  but if(index <=0) is more safe for empty array in edge case
            return -1;
        }

        return lastOccurence(arr,index-1,target);
    }

    public static void main(String[] args)  {
//        int[] arr = {2,5,3,5,8,5};
        int[] arr = {5,2,3,8};
        int target = 9;
        int index = arr.length-1;
        int result = lastOccurence(arr,index, target);
        System.out.println(result);
    }
}
