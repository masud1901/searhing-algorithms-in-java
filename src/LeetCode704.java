// Plain old binary search

public class LeetCode704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int answer = search(nums, target);
        System.out.println(answer);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }


}
