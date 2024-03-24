import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            int value = in.nextInt();
            System.out.println(binarySearch(list, value));
//            System.out.println(linearSearch(list, value));

        }


    }

    static int linearSearch(List<Integer> list, int value) {
        if (list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return i;
            }
        }
        return -1;
    }


    static int binarySearch(List<Integer> list, int value) {
        if (list.isEmpty()) {
            return -1;
        }
        int left = 0;
        int right = list.size() - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (mid == value) {
                return list.indexOf(mid);
            }

            if (mid > value) {
                right = mid - 1;

            }
            if (mid < value) {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }

        return -1;
    }
}