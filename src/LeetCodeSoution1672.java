//        Richest Customer Wealth
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6


public class LeetCodeSoution1672 {
    public static void main(String[] args) {

//        int[][] accounts = {
//                {1, 2, 3},
//                {3, 2, 1}
//        };

        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        System.out.println(maxRow(accounts));

    }

    static int maxRow(int[][] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int tempMax = 0;

            for (int j = 0; j < array[i].length; j++) {
                tempMax += array[i][j];
            }
            if (tempMax > max) {
                max = tempMax;
            }
        }

        return max;
    }
}
