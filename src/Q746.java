public class Q746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int opt1 = cost[0];
        int opt2 = cost[1];
        if(n <= 2) return Math.min(opt1, opt2);
        for(int i = 2; i < n; i++){
            int cur = cost[i] + Math.min(opt1, opt2);
            opt1 = opt2;
            opt2 = cur;
        }
        return Math.min(opt1, opt2);
    }
}
