package com.leetcode.medium;

import java.util.Arrays;

public class findFirstLastPositionOfElement_034 {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int target=8;
        findFirstLastPositionOfElement_034 obj= new findFirstLastPositionOfElement_034();
         //obj.searchRange(arr,target);


        System.out.println(Arrays.toString(obj.searchRange(arr,target)));
        //System.out.println(obj.lowerBound(arr,15));
      //  System.out.println(obj.UpperBound(arr,15));

    }
    public  int[] searchRange(int[] nums, int target) {
        int [] index=new int[2];
        index[0]=lowerBound(nums,target);
        index[1]=UpperBound(nums,target);

        return index;
    }




    public int lowerBound(int [] arr,int target){
        int ans=-1;

        int left=0, right=arr.length-1;

        while (left<=right){    //USE LEFT<= RIGHT WHEN U A POSSIBLE ANSWER AT 0TH INDEX
            int mid = left+(right-left)/2;
            if (arr[mid]==target){
                ans=mid;
                right=mid-1;
            }
            if (arr[mid]<target){
                left=mid+1;
            }else {
              right =mid-1;
            }

        }



        return ans;
    }

    public int UpperBound(int [] nums, int target){
        int ans=-1;
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;

            if (nums[mid]==target){
                ans=mid;
                left=mid+1;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }


        return ans;
    }

}
