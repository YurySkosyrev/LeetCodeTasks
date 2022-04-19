package Tasks;

import java.util.HashMap;

public class Main {
    class Solution {
        // Two sums
        // 1. Brute force
        public int[] twoSum_1(int[] nums, int target) {
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

        /***************************************************************************************************/

        public int[] twoSum_2(int[] nums, int target) {
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

        /***************************************************************************************************/
        public int romanToInt(String s) {
            HashMap<Character, Integer> hash = new HashMap<>();
            hash.put('I', 1);
            hash.put('V', 5);
            hash.put('X', 10);
            hash.put('L', 50);
            hash.put('C', 100);
            hash.put('D', 500);
            hash.put('M', 1000);
            int result = hash.get(s.charAt(s.length()-1));
            for (int i = s.length()-1; i > 0; i--){
                if (hash.get(s.charAt(i-1)) < hash.get(s.charAt(i)))
                    result -= hash.get(s.charAt(i-1));
                else
                    result += hash.get(s.charAt(i-1));
            }
            return result;
        }
    }
}