import java.util.ArrayList;
import java.util.Scanner;

public class CeilingAndFloorSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : new int[]{4, 5, 6, 45, 89, 452, 5624, 6634, 45626}) {
            list.add(i);
        }
        System.out.println(list);

//        Print the numbers upto the target

        int target = in.nextInt();
        int index = ceilingSearch(list, target);
        System.out.println("Ceiling of the number " + list.get(index));
        index = floorSearch(list, target);
        System.out.println("Floor of the number " + list.get(index));


    }

    static int ceilingSearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid;
            } else if (target > list.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    static int floorSearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid;
            } else if (target > list.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }


}
