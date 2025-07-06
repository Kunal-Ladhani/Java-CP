import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReader_Template {
    public static void main(String[] args) throws IOException {

        // --------- BufferedReader CLASS DEFINATIONS ----------
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCases = Integer.parseInt(st.nextToken());

        // ======= SOLVE FROM HERE
        int ans = 0;

        while (testCases-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x % testCases == 0)
                ans++;
        }
        System.out.println(ans);
    }
}
