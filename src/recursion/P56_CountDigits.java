package recursion;

public class P56_CountDigits {
    public static int sum(int num) {
        int sum = 0;
        if (num == 0) return 0;
        return 1 + sum(num / 10);
    }

    public static void main(String[] args) {
        int result = sum(1028);
        System.out.println(result);
    }
}



