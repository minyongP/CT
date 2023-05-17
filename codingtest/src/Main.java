import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coins = {10, 5, 1}; // 동전의 단위(금액) 배열
        int amount = 27; // 교환하려는 금액

        int result = coinChange(coins, amount);
        System.out.println("Minimum number of coins required: " + result);
    }

    private static int coinChange(int[] coins, int amount) {
        // 교환에 필요한 동전의 개수를 저장하는 배열
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // 초기값으로 교환할 수 없는 큰 값으로 채움
        dp[0] = 0; // 0원을 교환하는 경우는 동전이 필요하지 않으므로 0으로 초기화

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    // 현재 금액(coins[j])을 교환하기 위해 필요한 동전의 개수와
                    // 현재 금액에서 동전의 단위를 뺀 금액을 교환하기 위해 필요한 동전의 개수 + 1 중 작은 값 선택
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}