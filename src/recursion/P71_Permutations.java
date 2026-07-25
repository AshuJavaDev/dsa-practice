package recursion;

public class P71_Permutations {
  static  void permute(char[] arr , int index)  {
        if(index == arr.length)  {
            System.out.println(new String(arr));
            return;
        }

        for(int i = index; i < arr.length; i++)  {
           char temp = arr[index];
           arr[index] = arr[i];
           arr[i] = temp;
            permute(arr,index+1);
           char temp2 = arr[index];
           arr[index] = arr[i];
           arr[i] = temp2;

        }
    }

    public static void main(String[] args)  {
        String str = "abc";
        char[] arr = str.toCharArray();
        int index = 0;
        permute(arr, index);
    }

}
