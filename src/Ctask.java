import java.util.Scanner;

public class Ctask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        if (b < 0) {
            return;
        }
        long lo = Math.max(a, 0);

        long k = (long) Math.sqrt((double) lo);
        while (k > 0 && (k - 1) * (k - 1) >= lo) {
            k--;
        }
        while (k * k < lo) {
            k++;
        }

        StringBuilder sb = new StringBuilder();
        for (; k * k <= b; k++) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(k * k);
        }
        System.out.print(sb);
    }
}