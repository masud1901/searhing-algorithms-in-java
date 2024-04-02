// Search  binary in 2D array


public class LeetCode74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 9;
        boolean answer = searchMatrix(matrix, target);
        System.out.println(answer);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length - 1;

        for (int row = 0; row < matrix.length; row++) {
            int check = matrix[row][matrix[row].length - 1];
            if (target <= check) {
                while (start <= end) {
                    int mid = start + (end - start) / 2;

                    if (matrix[row][mid] == target) {
                        return true;
                    }
                    if (target > matrix[row][mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
