package strings;

class Reverse   {

        String reverseString(String input)      {
            String temp = "";
            for(int i = input.length()-1; i>=0; i--) {
                temp += input.charAt(i);
            }
            return temp;
        }
    }

    public class ReverseString    {
        public static void main(String[] args) {
            Reverse ab = new Reverse();
            String fn = ab.reverseString("Hello");
            System.out.println(fn);

        }
    }



