//Find Smallest Letter Greater Than Target
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
public class LeetCode744 {
    public static void main(String[] args) {

//        ArrayList<String> letters = new ArrayList<>(Arrays.asList("c", "f", "j"));

        char[] letters = {'c', 'f', 'j'};

//        for (int i = 0; i < letters.length; i++) {
//            System.out.println(letters[i]);
//        }
        char target = 'c';
        int solutionIndex = ceilingSearch(letters, target);
        for (char letter : letters) {
            if (target != letter) {
                continue;
            }
            solutionIndex++;
            if (solutionIndex != letters.length) {
                continue;
            }
            solutionIndex = 0;
        }

        System.out.println(letters[solutionIndex]);


    }

    static int ceilingSearch(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == letters[mid]) {
                return mid;
            }
                if (target < letters[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
