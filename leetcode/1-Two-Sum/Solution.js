/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
            for(let i = 0; i < nums.length; i++) {
                let v = nums.indexOf((target - nums[i]));

                if(v != -1 && v != i){
                    return [i, v];
                }
            }
    return [];
};