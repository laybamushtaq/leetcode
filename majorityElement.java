class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int maxCount = 0;
        int max = 0;

        for (int num : map.keySet()) {
            if (maxCount < map.get(num)) {
                maxCount = map.get(num);
                max = num;
            }
        }

        return max;
    }
}