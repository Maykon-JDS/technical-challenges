class Solution {
    public void reverseString(char[] s) {
        int base = 0;

        for(int top = s.length - 1; top >= 0; top--){

            if (
                base == top ||
                (s.length % 2 == 0 && base >= s.length / 2)
            ) {
                break;
            }

            char cache = s[base];

            s[base] = s[top];
            s[top] = cache;

            base++;
        }

    }
}