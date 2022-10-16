import java.util.HashMap;

public class Q121 {
    public int maxProfit(int[] prices) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        int low = Integer.MAX_VALUE;
        int globalMaxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < low) low = prices[i];
            if(prices[i] - low > globalMaxProfit) globalMaxProfit = prices[i] - low;
        }
        return globalMaxProfit;
    }
}
