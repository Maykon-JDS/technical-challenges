class Solution {
    public int lengthOfLongestSubstring(String s) {

        int p1 = 0;
        int p2 = 0;

        int longest = 0;

        HashSet<String> l = new HashSet<>();

        while (p1 < s.length()){

            if( 
                (p2 >= s.length()) || 
                (l.contains(String.valueOf(s.charAt(p2))))
            ) {
                if(longest < (p2 - p1)) {
                    longest = (p2 - p1);
                }

                p1++;
                p2 = p1;
                l.clear();
                continue;
            }

            l.add(String.valueOf(s.charAt(p2)));


            p2++;
        }

        return longest;
    }
}