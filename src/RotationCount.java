// Finding the Rotation count of an sorted array


public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 9, 1, 2, 3};
//        int[] nums = {1, 3, 5};
//        int[] nums = {5, 1, 2, 3, 4};
        int answer = pivotSearch(nums);
//        answer is always the place of the pivot
        if (answer != nums.length - 1) {

            answer++;
        } else {
            answer = 0;
        }
        System.out.println(answer);
    }

    static int pivotSearch(int[] nums) {
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
                    return mid - 1;
                }
            }


            if (mid + 1 != nums.length) {
                if (nums[mid] > nums[mid + 1]) {  // this is the pivot
                    return mid;
                }
            }

            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
