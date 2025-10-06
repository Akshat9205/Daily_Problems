package dsa_solutions;

import java.util.Scanner;
public class Peak_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int peak = findPeak(arr);
        System.out.println("Peak element: " + peak);
        sc.close();
    }

    public static int findPeak(int[] nums) {
        // Approach 1: Linear Scan -> O(N) time and O(1) space
        int max=nums[0];
        int a=0; 
        for(int i=0;i<nums.length;i++){
             if(nums[i]>max){
                max=nums[i];
                a=i;
             }
        }
        return a;

        // Approach 2: Binary Search -> O(log N) time and O(1) space
        // int start = 0;
        // int end = nums.length - 1;
        // while (start < end) {
        //     int mid = start + (end - start) / 2;
        //     // If mid is greater than next, you're on a descending slope → move left
        //     if (nums[mid] > nums[mid + 1]) {
        //         end = mid;
        //     } else {
        //         // You're on an ascending slope → move right
        //         start = mid + 1;
        //     }
        // }
        // // start == end → this is the peak
        // return start;
    }
}
