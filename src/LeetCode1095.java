//Find in Mountain Array


public class LeetCode1095 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 2, 0};
        int target = 0;
        int answer = findInMountainArray(arr, target);
        System.out.println(answer);

    }

    public static int findInMountainArray(int[] arr, int target) {
        int peak = peakSearch(arr);
        if (arr[peak] == target) {
            return peak;
        }
        int ascendingHalf = binarySearchOnAscendingList(arr, target, peak);
        if (ascendingHalf != -1) {
            return ascendingHalf;
        }
        return binarySearchOnDescendingList(arr, target, peak);

    }

    static int peakSearch(int[] arr) {
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

    static int binarySearchOnAscendingList(int[] arr, int target, int end) {
        int start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchOnDescendingList(int[] arr, int target, int start) {
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
