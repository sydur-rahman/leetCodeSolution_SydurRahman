package com.leetcode.easy;
public class MissingPositiveNumber_1539 {
    public static void main(String[] args) {
        int arr[]= {2,3,4,7,11};
        System.out.println(kthPositive(arr,5));
    }

    public static int kthPositive(int [] arr,int k){
        int start= 0;
        int end=arr.length-1;
        int ans=0;

        while (start<=end){
            int mid= start+(end-start)/2;
            int countMissing=arr[mid]-mid-1;
            if(countMissing>k){
                ans=mid;
                end=mid-1;
            }   else {
                start=mid+1;
            }
        }


        return ans+k;
    }

}
