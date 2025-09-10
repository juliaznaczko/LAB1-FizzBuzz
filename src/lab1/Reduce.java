package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = reduce(100);
        System.out.println(count);
    }

    public static int reduce(int n) {
        int i = 100;
        int total = 0;

        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
                total += 1;
            }
            else {
                i -= 1;
                total += 1;
            }

        }
        return total;
    }

    public static int reduce() {
        return reduce(100);
    }
}
