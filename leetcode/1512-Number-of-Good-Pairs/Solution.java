import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {

        Hashtable<Integer, Integer> hashTable = new Hashtable<>();

        for(int num : nums) {

            Integer value = hashTable.getOrDefault(num, -1);

            if(value != -1){

                hashTable.put(num, value + 1);
                continue;

            }

            hashTable.put(num, 1);

        }

        return this.countGoodPairs(hashTable);

    }

    public int countGoodPairs(Hashtable<Integer, Integer> frequencyMap){

        Integer goodParis = 0;

        for (Integer key : frequencyMap.keySet()){

            goodParis += (frequencyMap.get(key) * (frequencyMap.get(key) - 1))/2;

        }

        return goodParis;

    }
}