import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int total = 0;

        for(short i = 0; i < n; i++){

            List<Integer> filtredList = new ArrayList<>();

            for(short j = 0; j < n; j++){

                if(i < j){
                    filtredList.add(ar.get(j));
                }

            }

            for(Integer valueFiltredList : filtredList ){

                if((valueFiltredList + ar.get(i)) % k == 0){
                    total++;
                }

            }

        }

        return total;

    }

}