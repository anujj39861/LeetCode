class Solution {
    public int findGCD(int[] nums) {
        int minimum = nums[0];
        int maximum = nums[0];
        int count = 0;
        for(int i = 0; i<nums.length-1; i++){
            minimum = Math.min(minimum, nums[i+1]);
            maximum = Math.max(maximum, nums[i+1]);
        }
        while(minimum != maximum){
            if(minimum > maximum){
                minimum = minimum - maximum;
            }else{
                maximum = maximum - minimum;
            }
        }
    return minimum;
    }
}