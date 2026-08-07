class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> newmap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            newmap.put(nums[i], i);
        }

        for(int i=0; i<nums.length;i++){
            int diff = target - nums[i];
            if(newmap.containsKey(diff) && newmap.get(diff) != i){
                return new int[]{i, newmap.get(diff)};
            }
        }
        return new int[0];
    }
}