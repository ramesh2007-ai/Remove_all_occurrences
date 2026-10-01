public class Remove_all_occurrences {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("hello world");
        char c = 'l';

        Solution obj = new Solution();
        obj.removeCharacter(s, c);

        System.out.println(s);
    }
}

class Solution {

    public void removeCharacter(StringBuilder s, char c) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != c) {
                ans.append(s.charAt(i));
            }
        }

        s.setLength(0);
        s.append(ans);
    }
}