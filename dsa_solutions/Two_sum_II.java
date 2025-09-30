package dsa_solutions;

import java.util.Scanner;

public class Two_sum_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums =  new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static int[] twoSum(int[] numbers, int target) {
        // APPROACH 1: BRUTE FORCE -> O(N^2) time and O(1) space
        int n = numbers.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};

        // APPROACH 2: TWO POINTERS -> O(N) time and O(1) space (OPTIMAL)
        // int n  = numbers.length;
        // int i = 0;
        // int j= n-1;
        // while(i<j){
        //     int sum = numbers[i]+numbers[j];
        //     if(sum == target){
        //         return new int[]{i+1, j+1};
        //     }else if(sum < target){
        //         i++;
        //     }else{
        //         j--;
        //     }
        // }
        // return new int[]{-1, -1};

        // APPROACH 3: BINARY SEARCH -> O(N log N) time and O(1) space
    //     int n = numbers.length;
    //     for(int i=0;i<n;i++){
    //         int comp = target-numbers[i];
    //         int j = binary(numbers,i+1,n-1,comp);
    //         if(j!=-1){
    //             return new int[]{i+1,j+1};
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }
    // public static int binary(int[]numbers,int left,int right,int key){
    //     while(left<=right){
    //         int mid = left + (right-left)/2;
    //         if(numbers[mid]==key){
    //             return mid;
    //         }else if(numbers[mid]<key){
    //             left = mid+1;
    //         }else{
    //             right = mid-1;
    //         }
    //     }
    //     return -1;
    // }
    }
}
