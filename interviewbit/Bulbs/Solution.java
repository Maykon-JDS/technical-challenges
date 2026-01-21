public class Solution {
    public int bulbs(ArrayList<Integer> A) {
        int cost = 0;
        int flip = 0;

        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == 1 && (flip % 2) == 0
            || A.get(i) == 0 && (flip % 2) == 1){
                continue;
            }

            flip++;
            cost++;
        }

        return cost;
    }
}
