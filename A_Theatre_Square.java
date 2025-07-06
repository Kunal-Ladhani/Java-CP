import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// --------- RENAME CLASS TO YOUR QUESTION NAME ------------
public class A_Theatre_Square {

    public static FastReader scn = new FastReader();

    // ------------- WRITE SOLUTION HERE -----------------
    private static long solver(int n, int m, int a) {
        long ans = 1;
        ans *= ((n / a) + ((n % a != 0) ? 1 : 0));
        ans *= ((m / a) + ((m % a != 0) ? 1 : 0));
        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a = scn.nextInt();

        System.out.println(solver(n, m, a));
    }

    // -------------- CUSTOM FastReader CLASS -----------------
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
