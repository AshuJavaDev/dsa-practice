package recursion;

import java.util.ArrayList;
import java.util.List;

public class P70_Subsets {

    static void subsets(int[] arr, int index, List<Integer> current)  {
        if(index == arr.length)  {
            System.out.println(current);
             return;
        }

          subsets(arr, index+1, current);

         current.add(arr[index]);
         subsets(arr,index+1, current);
         current.remove(current.size()-1);
    }

    public static void main(String[] args)  {
        int[] arr = {1,2};
        int index = 0;
        subsets(arr, index, new ArrayList<>());

    }
}
