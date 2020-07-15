class climbStairs {
    public static void main(String[] args) {
        System.out.println(_climbStairs(5));

    }

    public static int _climbStairs(int stairLevel) {
        if (stairLevel <= 2) {
            return stairLevel;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 3;
        for (int i = 3; i < stairLevel + 1; ++i) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

        }
        return f3;
        // f(1)=1
        // f(2)=2
        // f(3)=3
        // f(stairLevel)=f(stairLevel-1)+f(stairLevel-2)
        // f(3)=f(2)+f(1)
        // f(4)=f(3)+f(2)
        // f(5)=f(4)+f(3)

    }

    // 递归
    public static int _climbStairs2(int stairLevel) {
        if (stairLevel == 1) {
            return 1;
        }
        if (stairLevel == 2) {
            return 2;
        }
        return _climbStairs2(stairLevel - 1) + _climbStairs2(stairLevel - 2);
    }

    // 动态规划
    public static int _climbStairs3(int stairLevel) {
        int[] dp = new int[stairLevel + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= stairLevel; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[stairLevel];

    }
}