import java.util.Scanner;

public class Stask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int num = 1;

        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}