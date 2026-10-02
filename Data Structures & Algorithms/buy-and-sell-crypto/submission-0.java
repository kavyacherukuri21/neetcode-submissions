class Solution {
    public int maxProfit(int[] prices) {
     int[] arr = new int[prices.length];
     int min = prices[0];
     for(int i=0;i<arr.length;i++) {
        min = Math.min(min,prices[i]);
        arr[i] = min;
    
     } 
     int res =0;
     for(int i=0;i<arr.length;i++){
res = Math.max(res,prices[i]-arr[i]);
     }

     System.out.println(Arrays.toString(arr));
     return res;
    }
}
