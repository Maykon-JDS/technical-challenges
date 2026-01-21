class Solution {
    public boolean isValid(String s) {

        Stack<Character> lifo = new Stack<Character>();

        for(char c : s.toCharArray()){

            if(List.of('(','{','[').contains(c)){
                lifo.push(c);
            }
            else if(lifo.isEmpty() || !List.of("()","{}","[]").contains(lifo.pop().toString() + String.valueOf(c))){
                return false;
            }

        }

        if(!lifo.isEmpty()){
            return false;
        }

        return true;

    }
}