class Solution {
    public boolean isPalindrome(int x) {
       String original = String.valueOf(x);

       StringBuilder res = new StringBuilder();
       res.append(original);
       res.reverse();

       if(res.toString().equals(original)){
        return true;
       }

       return false;
    }
}