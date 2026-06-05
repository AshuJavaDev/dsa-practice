import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate    {
    public static void main(String[] args)  {
        int[] arr = {1,2,3,4};
        HashSet<Integer> input = new HashSet<>();
        boolean isunique = true;

        for(int i = 0; i<arr.length; i++)   {
            if(input.contains(arr[i]))  {
                isunique = false;
            }   else {
                input.add(arr[i]);
            }
        }
        if(isunique)     {
            System.out.println("false");
        }   else    {
            System.out.println("true");
        }

    }
}