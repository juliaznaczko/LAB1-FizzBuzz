package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 5,3);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int total = 0;

        for  (int i = 1; i < n; i++) {
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            if (divisibleBya) {
                total +=1;
            } else if (divisibleByb) {
                total += 1;
            }
        }
        return total;
    }
}
