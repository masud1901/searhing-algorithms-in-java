import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr2D = new int[3][4];
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        int key = in.nextInt();


//        for (int i = 0; i < arr2D.length; i++) {
//            for (int j = 0; j < arr2D.length; j++) {
//                System.out.println(arr2D[i][j]);
//            }
//        }

//        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(search2DArray(arr2D, key)));
    }

    static int[] search2DArray(int[][] arr, int key) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }
}
