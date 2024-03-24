
//        Find Numbers with Even Number of Digits
//        Input: nums = [12,345,2,6,7896]
//        Output: 2


import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolve1295 {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int num : nums) {
            numbers.add(num);
        }

        List<String> numsAsStrings = new ArrayList<>();

        for (Integer number : numbers) {
            numsAsStrings.add(number.toString());
        }

        int count = 0;

        for (String numsAsString : numsAsStrings) {
            if (numsAsString.length() % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);


    }
}
