import java.io.*;

public class Otask {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        long n = (long) st.nval;

        boolean found = false;
        for (long i = 0; i < n; i++) {
            if (st.nextToken() == StreamTokenizer.TT_EOF) {
                break;
            }
            if (st.nval == 0) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}