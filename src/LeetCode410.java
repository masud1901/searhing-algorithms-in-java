import java.util.Arrays;

// Split Array Largest Sum
public class LeetCode410 {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        int answer = splitArray(nums, k);
        System.out.println(answer);

    }


    public static int splitArray(int[] nums, int k) {
        int start = findMax(nums);
        int end = Arrays.stream(nums).sum();


        while (start <= end) {
            int mid = start + (end - start) / 2;
            int subArrayCount = findingSubArrayCount(nums, mid);

            if (subArrayCount <= k) {
                end = mid - 1;
            }
            if (subArrayCount > k) {
                start = mid + 1;
            }
        }

        return start;

    }

    static int findingSubArrayCount(int[] nums, int target) {
        int subArrrayCount = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > target) {
                sum = nums[i];
                subArrrayCount++;
            }
        }
        return subArrrayCount;

    }

    public static int findMax(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Use the stream API to find the maximum value
        return Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);
    }
}
