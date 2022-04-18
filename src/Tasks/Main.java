package Tasks;

import java.util.HashMap;

public class Main {
    // Two sums
    // 1. Brute force
    class Solution_1_1 {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length - 1; i++){
                for (int j = i + 1; j < nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        result[0]=i;
                        result[1]=j;
                        return result;
                    }
                }
            }
            return result;
        }
    }

    // 2. Hashmap
    public class Solution_1_2 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int i = 0; i <= nums.length; i++){
                int value = target - nums[i];
                if (hash.containsKey(value)) {
                    int[] Ans = {hash.get(value), i};
                    return Ans;
                }
                hash.put(nums[i], i);
            }
            return null;
        }
    }
}