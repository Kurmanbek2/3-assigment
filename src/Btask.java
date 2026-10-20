import java.util.Scanner;

public class Btask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long m = Math.abs(d);
        if (m == 0) {
            return;
        }

        long lo = a;
        long hi = b;
        if (c > 0) {
            if (c >= m) {
                return;
            }
            lo = Math.max(lo, 0);
        } else if (c < 0) {
            if (-c >= m) {
                return;
            }
            hi = Math.min(hi, -1);
        }

        long start = lo + Math.floorMod(c - lo, m);

        StringBuilder sb = new StringBuilder();
        for (long x = start; x <= hi; x += m) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(x);
        }
        System.out.print(sb);
    }
}