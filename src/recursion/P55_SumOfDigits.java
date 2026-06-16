package recursion;

public class P55_SumOfDigits {
    public static int sum(int num) {
        int sum = 0;
        if (num == 0) return 0;
        return (num % 10) + sum(num / 10);

    }

    public static void main(String[] args) {
        int result = sum(1034);
        System.out.println(result);
    }

}

