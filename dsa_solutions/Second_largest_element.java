package dsa_solutions;

import java.util.*;

public class Second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums =  new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }   
        int result = secondLargest(nums);
        System.out.println(result);
        sc.close();
    }

    public static int secondLargest(int[] nums) {
        // APPROACH 1: BRUTE FORCE -> O(N log N) time and O(1) space
        int n = nums.length; 
        Arrays.sort(nums);
        int largest = nums[n - 1];
        int secondLargest = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                secondLargest = nums[i];
                break;
            }
        }
        return secondLargest;

        // APPROACH 2(TWO PASS): BETTER -> O(N) time and O(1) space
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
        // for (int num : nums) {
        //     largest = Math.max(largest, num);
        // }
        // for (int num : nums) {
        //     if(num != largest){
        //         secondLargest = Math.max(secondLargest, num);
        //     }
        // }
        // if(secondLargest == Integer.MIN_VALUE) return -1;
        // return secondLargest;

        // APPROACH 3(SINGLE PASS): OPTIMAL -> O(N) time and O(1) space
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
        // for (int num : nums) {
        //     if (num > largest) {
        //         secondLargest = largest;
        //         largest = num;
        //     } 
        //     else if (num > secondLargest && num < largest) {
        //         secondLargest = num;
        //     }
        // }
        // if (secondLargest == Integer.MIN_VALUE) {
        //     return -1;
        // } 
        // else 
        //     return secondLargest;
    }
}
