class Solution {
    public int[] twoSum(int [] nums, int target){
        int[] blank = new int[2];
        int total;
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j< nums.length; j++){
                if (i == j && j != nums.length - 1){
                    j++;
                }
                total = nums[i] + nums[j];
                if (total == target){
                    System.out.print(total);
                    int[] newArray = new int[2];
                    newArray[0] = i;
                    newArray[1] = j;
                    return newArray;
                }
            }
        }
        return blank;
    }
}