class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        int []robAmt = new int[size];
        for(int hIndx = 0; hIndx < size; hIndx++){
              if(hIndx == 0)robAmt[hIndx] = nums[hIndx];
              else if(hIndx == 1)robAmt[hIndx] = Math.max(nums[0], nums[1]);
              else robAmt[hIndx] = Math.max(robAmt[hIndx-1], nums[hIndx] + robAmt[hIndx - 2]);
        }
        return robAmt[size - 1];
    }
}