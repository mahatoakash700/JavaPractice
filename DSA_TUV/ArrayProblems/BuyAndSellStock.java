package ArrayProblemPractice;

public class BuyAndSellStock {

    // once buy value is assigned , we can only increment it, we cannot come back
    // seelct previous prices as each iteration represent days which once is crossed
    // cannot be chosen back. so once we get buyvalue we can only compare by
    // iterating to next day and compare with it

    public int maxProfitBrute(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int lowBuy = prices[i]; // once buy value is assigned , we can only increment it
            System.out.println("buy value:" + lowBuy);
            for (int j = i + 1; j < prices.length; j++) {
                int highSell = prices[j];
                System.out.println("sell value: " + highSell);
                System.out.println("current Profit: " + (highSell - lowBuy));
                maxProfit = Math.max(maxProfit, highSell - lowBuy);
            }

            System.out.println("maxprofit: " + maxProfit);
        }

        return (maxProfit);
    }

    public int maxProfitTwoPointer(int[] prices) {
        int maxProfit = 0;
        int left = 0, right = 1;
        int buyprice = 0, sellPrice = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                // maxProfit = Math.max(maxProfit, profit);
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyprice = prices[left];
                    sellPrice = prices[right];
                }
            } else {
                left = right;
            }
            right++; // not putting inside else, as if both left==right, then right will not
                     // increment
        }
        System.out.println("max profit: " + maxProfit);
        System.out.println("buy price: " + buyprice);
        System.out.println("sell price: " + sellPrice);
        return (maxProfit);
    }
}
