//Find Minimum in Rotated Sorted Array


import static java.lang.Math.min;

public class LeetCode153 {
    public static void main(String[] args) {


        int[] nums = {3, 4, 5, 1, 2};
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] nums = {4, 5, 6, 7, 8, 9, 10, 0, 1, 2, 3};
//
        int output = findMin(nums);
        System.out.println(nums[output]);

    }

    public static int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            int answer = min(nums[0],nums[1]);
            return answer;
        }
        int start = 0;
        int end = nums.length - 1;
        if (end == 0) {
            return 0;
        }
        if (end == 1) {
            if (nums[0] > nums[1]) {
                return 0;
            } else {
                return 1;
            }
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid - 1 != -1) {
                if (nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                }
            }


            if (mid + 1 != nums.length) {
                if (nums[mid] > nums[mid + 1]) {
                    return nums[mid + 1];
                }
            }


            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return nums[(end + 1) % nums.length];
    }
}