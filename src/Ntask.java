import java.io.*;

public class Ntask {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        long n = (long) st.nval;

        long zeros = 0;
        long positive = 0;
        long negative = 0;
        for (long i = 0; i < n; i++) {
            if (st.nextToken() == StreamTokenizer.TT_EOF) {
                break;
            }
            double x = st.nval;
            if (x == 0) {
                zeros++;
            } else if (x > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println(zeros + " " + positive + " " + negative);
    }
}