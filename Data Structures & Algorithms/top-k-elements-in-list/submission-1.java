
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
HashMap<Integer,Integer>hm = new HashMap<>();
for(int num : nums) {
    hm.put(num,hm.getOrDefault(num,0)+1);
}
PriorityQueue<Map.Entry<Integer,Integer>> n = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
n.addAll(hm.entrySet());
int[] result = new int[k];
for(int i=0;i<k;i++) {
    result[i] = n.poll().getKey();
}
return result;
    }
}

