package recursion;

public class P69_SubsequenceGeneration {
      static void subseq(String str, int index, String current)  {

          if(index == str.length()) {
              System.out.print(current + " ");
              return;
          }

          subseq(str, index+1, current);
          subseq(str, index+1, current + str.charAt(index));
      }

      public static void main(String[] args)  {
          String str = "ab";
          int index = 0;
          String current = "";
          subseq(str, index, current);
      }
}
