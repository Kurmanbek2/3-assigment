import java.util.Scanner;

public class Qtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        for (long x = 1000; x >= 0; x--) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.print(x + " ");
            }
        }
    }
}