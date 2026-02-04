class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.parallelSort(nums1);
        List<Integer> result = new ArrayList<>();

        for(int i : nums2) {
            if(
                Arrays.binarySearch(nums1, i) >= 0 && 
                result.indexOf(i) == -1
            ) {
                result.add(i);
            }
        }
       
        return result.parallelStream().mapToInt(Integer::intValue)
                  .toArray();
    }

}