class Solution {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
            }
        }

        Arrays.sort(nums);

        int notMaxNumber = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < Integer.MAX_VALUE){
                notMaxNumber++;
            }
        }

        int[] slicedArray = new int[notMaxNumber];
        for (int i = 0; i < notMaxNumber; i++){
            slicedArray[i] = nums[i];
        }

        return slicedArray.length;
    }
}