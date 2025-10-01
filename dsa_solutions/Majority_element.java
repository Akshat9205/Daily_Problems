package dsa_solutions;

import java.util.Scanner;

public class Majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums =  new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = majorityElement(nums);
        System.out.println(result);
        sc.close();
    }
    public static int majorityElement(int[] nums) {
        // APPROACH 1: BRUTE FORCE -> O(N^2) time and O(1) space
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > n/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // APPROACH 2: USING HASHMAP -> O(N) time and O(N) space (BETTER)
        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int key : map.keySet()){
        //     if(map.get(key) > n/2){
        //         return key;
        //     }
        // }
        // return -1;

        // APPROACH 3: MOORE'S VOTING ALGORITHM -> O(N) time and O(1) space (OPTIMAL)
        int count = 0;
        int candidate = 0;
        // in one iteration we find our majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            // if the same element is found increment the count otherwise decrement the count
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    
}
