#include <iostream>
#include <cmath>

class Solution {

public:
    int search(vector<int>& nums, short target) {
        short low = 0;
        short high = nums.size() - 1;

        short currentIndex;

        while(low <= high){

            currentIndex = floor(((low + high) / 2));

            if(nums[currentIndex] == target){
                return currentIndex;
            }
            else if(nums[currentIndex] > target){
                high = currentIndex - 1;
            }
            else {
                low = currentIndex + 1;
            }

        }

        return -1;

    }
};