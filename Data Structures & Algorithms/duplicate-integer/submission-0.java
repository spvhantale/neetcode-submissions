class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> duplicates = new LinkedHashMap<>();
        for(int i =0;i<nums.length;i++){
            if(duplicates.get(nums[i])!=null){
                return true;
            }else{
                duplicates.put(nums[i],1);
            }
        }
        return false;
    }
}