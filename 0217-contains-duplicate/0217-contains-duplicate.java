import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intset = new HashSet<>();

        for(int num : nums){
            if(intset.contains(num)){
                return true;
            }   
            intset.add(num);
        }
    return false;
    }
}