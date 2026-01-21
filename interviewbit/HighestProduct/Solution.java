import java.util.Collections;
import java.util.Comparator;


public class Solution {
    public int maxp3(ArrayList<Integer> A) {
      Collections.sort(A, Comparator.reverseOrder());
      int possibleOne = A.get(0) * A.get(1) * A.get(2);
      int possibleTwo = A.get(0) * A.get(A.size() - 2) * A.get(A.size() - 1);
      return possibleOne >= possibleTwo ? possibleOne : possibleTwo;
    }
}
