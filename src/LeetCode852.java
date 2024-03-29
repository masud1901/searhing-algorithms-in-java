// Peak Index in a Mountain Array


public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr = {0, 10,10, 5, 2};
        int answer = peakIndexInMountainArray(arr);
        System.out.println(answer);

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }
        }
        return left;

    }
}
