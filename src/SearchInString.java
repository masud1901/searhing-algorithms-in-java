import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int key = in.next().strip().charAt(0);


        System.out.println(linearStringSearch(s, key));


    }

    static boolean linearStringSearch(String s, int key) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == key) {
                return true;
            }
        }
        return false;

    }
}
