import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// --------- RENAME CLASS TO YOUR QUESTION NAME ------------
public class B_Line_Segments {

    public static FastReader scn = new FastReader();

    // ------------- WRITE SOLUTION HERE -----------------
    public static void main(String[] args) {
        int t = scn.nextInt();

        while (t-- > 0) {
            // SOLVE HERE
            int n = scn.nextInt();
            int px = scn.nextInt();
            int py = scn.nextInt();
            int qx = scn.nextInt();
            int qy = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int ans = 0;

        }

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
