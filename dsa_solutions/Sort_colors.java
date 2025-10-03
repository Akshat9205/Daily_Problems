package dsa_solutions;

public class Sort_colors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] nums) {
        // APPROACH 1: USING INBUILT SORT FUNCTION -> O(N log N) time and O(1) space
        // Arrays.sort(nums);

        // APPROACH 2: COUNTING SORT -> O(N) time and O(1) space
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int num : nums){
            if(num == 0) count0++;
            else if(num == 1) count1++;
            else count2++;
        }
        // bina extra space ke same array ko update kardo count wise
        int index = 0;
        while(count0 > 0){
            nums[index++] = 0;
            count0--;
        }
        while(count1 > 0){
            nums[index++] = 1;
            count1--;
        }
        while(count2 > 0){
            nums[index++] = 2;
            count2--;
        }

        // APPROACH 3: DUTCH NATIONAL FLAG ALGORITHM -> O(N) time and O(1) space
            // 0 ka exact positon dene ke liye low pointer
        // int low = 0;
            // element ki current position ke liye mid pointer
        // int mid = 0;
            // 2 ka exact position dene ke liye high pointer
        // int high = nums.length - 1;
        // while(mid <= high){
        //     if(nums[mid] == 0){
        //         int temp = nums[low];
        //         nums[low] = nums[mid];
        //         nums[mid] = temp;
        //         low++;
        //         mid++;
        //     }
        //     else if(nums[mid] == 1){
        //         mid++;
        //     }
        //     else{
        //         int temp = nums[mid];
        //         nums[mid] = nums[high];
        //         nums[high] = temp;
        //         high--;
        //     }
        // }
    }
}
