package recursion;

public class P59_PowerOfTwo {
        public static boolean isPowerOfTwo(int n) {
            if (n == 1) return true;
            if (n % 2 != 0) return false;
            return isPowerOfTwo(n / 2);


        }

        public static void main(String[] args) {
            boolean result = isPowerOfTwo(10);
            System.out.println(result);

        }
    }



