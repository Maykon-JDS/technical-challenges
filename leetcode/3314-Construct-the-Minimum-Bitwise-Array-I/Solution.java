class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        int size = nums.size();
        int[] result =  new int[size];

        HashMap<Integer,Integer> cache = new HashMap<>();

        int j = 1;
        for(byte i = 0; i < size; i++){
            
            int value = nums.get(i);
            Integer cacheValue = cache.get(value);


            if (cacheValue != null) {
                result[i] = cacheValue;
                continue;
            }
            
            while(true){
                int valueJ = (j | (j + 1));

                if(cache.get(valueJ) == null){
                    cache.put(valueJ, j);
                }

                if(j >= value) {
                    result[i] = -1;
                    break;
                }

                if (valueJ == value) {
                    result[i] = j;
                    break;
                }
                j++;
            }
        }

        return result;
    }
}