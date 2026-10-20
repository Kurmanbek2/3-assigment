import java.util.Scanner;

public class Etask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs((long) sc.nextInt());

        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
    }
}