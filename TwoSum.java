class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> fun = new HashMap<>();
        for(int i =0; i<nums.length; i++){
           
            int lastOne = target - nums[i];
            if(fun.containsKey(lastOne)){
                return new int [] {fun.get(lastOne),i};
            }
             fun.put(nums[i],i);
        }
        return null;
    }
}
