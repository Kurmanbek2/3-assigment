import java.util.Scanner;

public class Dtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs((long) sc.nextInt());
        int d = sc.nextInt();

        int count = 0;
        if (x == 0 && d == 0) {
            count = 1;
        }
        while (x > 0) {
            if (x % 10 == d) {
                count++;
            }
            x /= 10;
        }
        System.out.println(count);
    }
}