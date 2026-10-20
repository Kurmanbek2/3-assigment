import java.util.Scanner;

public class Ftask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs((long) sc.nextInt());

        long rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        System.out.println(rev);
    }
}