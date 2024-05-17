package com.leetcode.medium;

public class PeakIndexInAMountain_852 {
    public static void main(String[] args) {
        int []arr={0,3,5,12,2};
        int j=peakIndexInMountainArray(arr);
        System.out.println(j);

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while (left<=right){
           // int mid=(left+right)/2; // this gives an overflow error
            int mid= right+(left-right)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                left=mid+1;

            }else{
                right=mid-1;
            }
        }



    return -1;
    }
}
//Link to the video which helped me to understand
//https://www.youtube.com/watch?v=w2HOAYymS3A