package com.leetcode.easy;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int [] nums={5,7,9,18,27};

        System.out.println(search(nums,99));
    }


    //leetCode 704
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid= (right+left)/2;

            if(target==nums[mid]){
                return mid;
            } else if (target>nums[mid]) {
                left=mid+1;
            }else {
                right=mid-1;
            }

        }



        return -1;
    }

}
