class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int gap = 0;

        for(int price : prices){
            if(price<lowest){
                lowest = price;
            }
            else if(gap<(price-lowest)){
                gap = price-lowest;
            }
          }
return gap;
    }
}