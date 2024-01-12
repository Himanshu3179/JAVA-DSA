// https://www.geeksforgeeks.org/problems/search-pattern0205/1

import java.util.ArrayList;

class SearchPattern {
    public static void main(String[] args) {
        String txt = "ssdgeegeek";
        String pat = "geek";
        System.out.println(search(pat, txt));
    }

    public static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i <= N - M; i++) {
            int j;

            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            }

            if (j == M) {
                result.add(i + 1);
            }
        }

        if (result.size() == 0) {
            result.add(-1);
        }

        return result;
    }
}
