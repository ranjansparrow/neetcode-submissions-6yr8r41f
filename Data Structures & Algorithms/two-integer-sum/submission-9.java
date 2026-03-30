class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int remaining = target - nums[i];
            if(myMap.containsKey(remaining)){
                return new int[]{myMap.get(remaining),i};
            }
            myMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
