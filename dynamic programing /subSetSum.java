package playground;

public class DP {

    public boolean subsetSum(int[] arr, int sum, int n) {
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (arr[n -1] <= sum) {
            return subsetSum(arr, sum - arr[n-1], n-1) || subsetSum(arr, sum, n - 1);
        } else {
            return subsetSum(arr,sum, n - 1);
        }
    }

//    bottumUp
    public boolean subSetSum(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
