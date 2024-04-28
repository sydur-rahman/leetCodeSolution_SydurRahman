package com.leetcode.easy;

public class TwoSum_001 {
    public static void main(String[] args) {
        TwoSum_001 solution = new TwoSum_001();
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = solution.twoSum(nums, target);
        for (int index : result) {
            System.out.print(index + " ");
        }

    }



    public int[] twoSum(int[] nums, int target) {
        int [] result= new int[2]; // this array is for storing the indexes
        for (int i =0; i<nums.length;i++  ){ // we run this loop from 0th index to the last index
            for (int j=i+1; j<nums.length;j++){ // this loop is one step ahead of the previous loop so that we can compare
                if(nums[i]+nums[j]==target){  //
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return nums;
    }
}