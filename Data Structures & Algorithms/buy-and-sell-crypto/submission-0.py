class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        for idx, price in enumerate(prices):
            i = idx
            i += 1
            while i < len(prices):
                net = prices[i] - price
                if net > 0 and net > maxP:
                    maxP = net
                i += 1

        return maxP

        
        