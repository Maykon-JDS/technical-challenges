public class Solution {
    public int bulbs(ArrayList<Integer> A) {
        int cost = 0;
        int flip = 0;

        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == 1 && (flip % 2) == 0
            || A.get(i) == 0 && (flip % 2) == 1){
                continue;
            }

            // A = this.flip(i, A);
            flip++;
            cost++;
        }

        return cost;
    }

    public ArrayList<Integer> flip(int index, ArrayList<Integer> A){
        // for(int i = index; i < A.size(); i++) {
        //     int value = (1 - A.get(i));
        //     A.set(i, value);
        // }

        IntStream.range(index, A.size())
             .parallel() // executa em paralelo
             .forEach(i -> A.set(i, 1 - A.get(i)));

        return A;
    }
}
