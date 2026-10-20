import java.util.Scanner;

public class Htask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();

        StringBuilder small = new StringBuilder();
        StringBuilder large = new StringBuilder();
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                small.append(i).append(' ');
                if (i != x / i) {
                    large.insert(0, (x / i) + " ");
                }
            }
        }
        System.out.println(small.toString() + large.toString());
    }
}