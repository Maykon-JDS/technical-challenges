class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            Integer temp = hash.get(nums[i]);

            if (temp == null) {
                hash.put(nums[i], 1);
                continue;
            }

            temp += 1;
            hash.put(nums[i], temp);
        }


        Map.Entry<Integer, Integer> max = hash.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        return max.getKey();
    }
}