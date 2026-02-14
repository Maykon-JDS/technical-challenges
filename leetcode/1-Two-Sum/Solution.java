class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            int v = this.indexOf(nums, (target - nums[i]));
            
            if(v >= 0 && v != i){
                System.out.print(i + " " + v);
                return new int[] {i, v};
            }
        }

        return new int[2];
    }

    public int indexOf(int [] nums, int value) {

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
