import java.util.Scanner;

public class Atask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        long start = a;
        if (start % 2 != 0) {
            start++;
        }

        StringBuilder sb = new StringBuilder();
        for (long i = start; i <= b; i += 2) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}