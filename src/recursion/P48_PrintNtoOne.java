package recursion;

public class P48_PrintNtoOne {
        static void print(int n)    {
        if(n!=0)    {
            System.out.print(n + " ");
                print(n-1);
            }
        }
        public static void main(String[] args)  {

            print(5);
        }
    }








