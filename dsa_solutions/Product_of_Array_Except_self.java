package dsa_solutions;

import java.util.Scanner;

public class Product_of_Array_Except_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int[] result = productExceptSelf(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    public static int[] productExceptSelf(int[] nums) {
        // APPROACH 1:BRUTE FORCE -> (O(N^2) time and O(1) space)
        int n = nums.length;
        int ans[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        return ans;

        // APPROACH 2: Using Prefix and Suffix Product -> (O(N) time and O(1) space)

        // int n = nums.length;
        // int[] res = new int[n];
        // for (int i = 0; i < n; i++) {
        //     res[i] = 1;
        // }
        // int prefix = 1;
        // Calculate prefix products
        // for(int i = 0; i < n; i++) {
        //     res[i] *= prefix;
        //     prefix *= nums[i];
        // }
        // Calculate suffix products and update result
        // int suffix = 1;
        // for(int i = n-1; i >= 0; i--) {
        //     res[i] *= suffix;
        //     suffix *= nums[i];
        // }
        // return res;

        // APPROACH 3:Division Method -> (O(N) time and O(N) space)

        // int n = nums.length;
        // int[] ans = new int[n];
        // long pro = 1;  
        // int zeroCount = 0;
        // int zeroIndex = -1;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == 0) {
        //         zeroCount++;
        //         zeroIndex = i;
        //     } else {
        //         pro *= nums[i];
        //     }
        // }
        // if (zeroCount > 1) {
        //     for (int i = 0; i < n; i++) {
        //         ans[i] = 0;
        //     }
        // } else if (zeroCount == 1) {
        //     ans[zeroIndex] = (int) pro;
        //     for (int i = 0; i < n; i++) {
        //         if (i != zeroIndex) {
        //             ans[i] = 0;
        //         }
        //     }
        // } else {
        //     for (int i = 0; i < n; i++) {
        //         ans[i] = (int) (pro / nums[i]);
        //     }
        // }

        // return ans;
        
    }
}
