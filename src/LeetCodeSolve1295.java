
//        Find Numbers with Even Number of Digits
//        Input: nums = [12,345,2,6,7896]
//        Output: 2


import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolve1295 {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        List<String> numsAsStrings = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            numsAsStrings.add(numbers.get(i).toString());
        }

        int count = 0;

        for (int i = 0; i < numsAsStrings.size(); i++) {
            if (numsAsStrings.get(i).length() % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);


    }
}
