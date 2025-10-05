package dsa_solutions;

import java.util.Scanner;

public class First_missing_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int[] nums =  new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }   
        int result = firstMissingPositive(nums);
        System.out.println(result);
        sc.close();
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // APPROACH 1: BRUTE FORCE -> O(N log N) time and O(1) space
        // Arrays.sort(nums);
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] != i + 1) {
        //         return i + 1;
        //     }
        // }
        // return n + 1;

        // APPROACH 2: HASHING -> O(N) time and O(N) space
        // Set<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     if (num > 0) {
        //         set.add(num);
        //     }
        // }
        // for (int i = 1; i <= n; i++) {
        //     if (!set.contains(i)) {
        //         return i;
        //     }
        // }
        // return n + 1;

        // APPROACH 3: CYCLIC SORT (OPTIMAL) -> O(N) time and O(1) space
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
