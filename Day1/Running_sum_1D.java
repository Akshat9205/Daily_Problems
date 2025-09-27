package Day1;
import java.util.Scanner;
public class Running_sum_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums =  new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static int[] runningSum(int[] nums) {
        // APPROACH 1 (BRUTE FORCE -> O(N2)) WITH SC -> O(N)
        // int n = nums.length;
        // int []a = new int [n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         a[i] += nums[j];
        //     }
        // }
        // return a;

        // APPROACH 2 (PREFIX SUM -> O(N)) WITH SC -> O(N)
        // int n = nums.length;
        // int []a = new int [n];
        // a[0] = nums[0];
        // for(int i=1;i<n;i++){
        //     a[i] = nums[i] + a[i-1];
        // }
        // return a;

        // APPROACH 3 (IN PLACE PREFIX SUM -> O(N)) WITH SC -> O(1)
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
