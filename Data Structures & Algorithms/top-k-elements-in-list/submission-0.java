class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
          List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(hm.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
         int[] result = new int[k];
         for(int i=0;i<k;i++) {
            result[i] = sortedEntries.get(i).getKey();
         }
        return result;
    }
}

