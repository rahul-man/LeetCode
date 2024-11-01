/*https://leetcode.com/problems/contains-duplicate/description/*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create map to store element & frequency
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            // map doesn't contains element, store and updates frequency
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                // map contains element, return true means array has duplicate element
                return true;
            }
        }
        // else return false
        return false;
    }
}
