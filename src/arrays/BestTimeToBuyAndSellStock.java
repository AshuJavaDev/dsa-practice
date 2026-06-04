import java.util.Arrays;

public class BestTimeToBuyAndSellStock    {
    public static void main(String[] args)  {
//        int[] arr = {7,1,5,3,6,4};
//        int[] arr = {7, 6, 4, 3, 1};
        int[] arr = {1,2,3,4,5};
        int mincount = Integer.MAX_VALUE;
        int count = 0;
        int maxcount = 0;
        int maxprofit = 0;

        for(int i = 0; i<arr.length;i++)    {
            count = arr[i];
            mincount = Math.min(count,mincount);

            maxprofit = arr[i] - mincount;
            maxcount = Math.max(maxprofit,maxcount);
        }

        System.out.println("Minimum price is: " +mincount);
        System.out.println("Maximum profit is: " +maxcount);

    }
}