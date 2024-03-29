import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] answer = searchRange(nums, target);
        System.out.println(Arrays.toString(answer));

    }

    public static int[] searchRange(int[] nums, int target) {

        if (binarySearch(nums, target)) {
            int upperIndex = ceilingSearch(nums, target);
//            System.out.println(upperIndex);
            int lowerIndex = floorSearch(nums, target);
//            System.out.println(lowerIndex);

            return new int[]{lowerIndex, upperIndex};
        }

        return new int[]{-1, -1};


    }

    static int floorSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    static int ceilingSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    static boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return true;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
