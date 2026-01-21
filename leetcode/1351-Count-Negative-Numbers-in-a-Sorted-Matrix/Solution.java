class Solution {
    public int countNegatives(int[][] grid) {
        int total = 0;
        for(int[] row : grid){
            int i = 0;
            for(int val : row) {
                if(val < 0){
                    total += row.length - i;
                    break;
                }
                i++;
            }
        }

        return total;
    }
}