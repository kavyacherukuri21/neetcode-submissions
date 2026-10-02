class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            int index=-1;
            if(nums[i] == target) {
                index = i;
                return i;
            }
        }
        return -1;
    }
}
