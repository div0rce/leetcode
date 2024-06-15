class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                index = i;
                return index;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (target > nums[nums.length-1]){
                return nums.length;
            }
            else if (target < nums[0]) {
                return 0;
            }
            else if (nums[i] < target && nums[i+1] >= target){
                index = i + 1;
                return index;
            }
        }
        return index;
    }
}