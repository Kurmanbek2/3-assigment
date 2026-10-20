import java.util.Scanner;

public class Gtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int d = 2;
        while (d * d <= x && x % d != 0) {
            d++;
        }
        if (x % d == 0) {
            System.out.println(d);
        } else {
            System.out.println(x);
        }
    }
}