import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// --------- RENAME CLASS TO YOUR QUESTION NAME ------------
public class A_Next_Round {

    public static FastReader scn = new FastReader();

    private static int solver(int n, int k, int[] arr) {
        int i = 0, ctr = 0;
        while (i < n) {
            if (arr[i] < arr[k - 1]) {
                break;
            }
            if (arr[i] > 0) {
                ctr++;
            }
            i++;
        }
        return ctr;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(solver(n, k, arr));

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
