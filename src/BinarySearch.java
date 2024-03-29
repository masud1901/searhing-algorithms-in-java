import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            list.add(6784 % i);
        }
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            int value = in.nextInt();
            System.out.println(binarySearch(list, value));
        }


    }


    static boolean binarySearch(ArrayList<Integer> list, int value) {
        Collections.sort(list);
        if (list.isEmpty()) {
            return false;
        }
        int left = 0;
        int right = list.size() - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (mid == value) {
//                return list.indexOf(mid);
                return true;
            }

            if (mid > value) {
                right = mid - 1;

            }
            if (mid < value) {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }

        return false;
    }
}

