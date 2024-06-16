package com.leetcode.medium;

public class findMinimumInRotatedSortedArray_153 {
    public static void main(String[] args) {
        int []nums_1={3,4,5,1,2};
        int [] nums_2= {1,2};
       // System.out.println(findMinimum(nums_1));
        System.out.println(findMin(nums_1));
    }
    public static int findMinimum(int[] nums){
     int left=0;
     int right=nums.length-1;
     int ans=nums[0];

     while (left<=right){
         int mid=left+(right-left)/2 ;
         if (nums[mid]>=ans){
             left=mid+1;
         }else{
             ans= nums[mid];
             right=mid-1;
         }

     }
     return ans;

    }
    public static int findMin(int[] a) {
        int l=0,r=a.length-1;

        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]<a[r]){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return a[l];
    }

}
