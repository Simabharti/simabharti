package com.sima;

public class linearSearchArray {
    public static void main(String[] args) {
    int [] search =  { };
    int target = 12;
        System.out.println("Enter the search element");
    int ans =  linearSearch (search,target);
        System.out.println(ans);

    }
    static int linearSearch(int[]arr, int target){
        if (arr.length==0){
            return  -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }


        }
        return -1;
    }}


