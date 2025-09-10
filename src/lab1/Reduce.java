package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = reduce(100);
        System.out.println(count);
    }

    public static int reduce(int n) {
        int total = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                total += 1;
            }
            else {
                n -= 1;
                total += 1;
            }

        }
        return total;
    }

    public static int reduce() {
        return reduce(100);
    }
}
