import java.util.Arrays;
import java.util.Scanner;

public class A_Add_or_XOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(minCost(a, b, x, y));
        }

        scanner.close();
    }

    public static int minCost(int a, int b, int x, int y) {
        if (a == b) {
            return 0;
        }

        // Use dynamic programming approach
        // dp[i] = minimum cost to reach i from a
        int maxVal = Math.max(a, b) + 1;
        int[] dp = new int[maxVal + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[a] = 0;

        // Process in order to ensure we get minimum cost
        for (int i = a; i <= maxVal; i++) {
            if (dp[i] == Integer.MAX_VALUE)
                continue;

            // Try increment operation
            if (i + 1 <= maxVal) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + x);
            }

            // Try XOR operation
            int xorResult = i ^ 1;
            if (xorResult <= maxVal && xorResult >= 0) {
                dp[xorResult] = Math.min(dp[xorResult], dp[i] + y);
            }
        }

        // Also try going backwards (for cases where a > b)
        if (a > b) {
            // We need to check if we can reach b from a using XOR
            // XOR can decrease only if number is odd
            for (int i = a; i >= 0; i--) {
                if (dp[i] == Integer.MAX_VALUE)
                    continue;

                // Try XOR operation
                int xorResult = i ^ 1;
                if (xorResult >= 0 && xorResult <= maxVal) {
                    dp[xorResult] = Math.min(dp[xorResult], dp[i] + y);
                }

                // Try increment (going up even when we want to go down)
                if (i + 1 <= maxVal) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i] + x);
                }
            }
        }

        return dp[b] == Integer.MAX_VALUE ? -1 : dp[b];
    }
}