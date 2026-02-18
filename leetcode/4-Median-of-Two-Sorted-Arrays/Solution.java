class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> t = new ArrayList<>();

        for(int i : nums1){
            t.add(i);
        }

        for(int i : nums2){
            t.add(i);
        }

        Collections.sort(t);

        int size = t.size();

        if(size % 2 != 0) {
            return Double.valueOf(t.get((size / 2)));
        }

        return (
                    Double.valueOf(t.get(size / 2)) + 
                    Double.valueOf(t.get((size / 2) - 1))
                )
            / 2 ;
    }
}