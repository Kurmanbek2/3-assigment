import java.util.Scanner;

public class Rtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();

        int count = 0;

        for (long x = 0; x <= 1000; x++) {
            if (x != e && a * x * x * x + b * x * x + c * x + d == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}