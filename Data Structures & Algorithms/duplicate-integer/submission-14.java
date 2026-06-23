class Solution {
    public boolean hasDuplicate(int[] nums) {
        // optimized approach
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        return set.size() != nums.length;
    }
}