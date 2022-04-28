package Tasks;

import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        int [] nums = new int[]{1,3,5,6};
        System.out.print(BinaryS(nums, 0));
    }



    // 1 Two sums
    public static int[] twoSum2 ( int[] nums, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            int value = target - nums[i];
            if (hash.containsKey(value)) {
                int[] Ans = {hash.get(value), i};
                return Ans;
            }
            hash.put(nums[i], i);
        }
        return null;
    }

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

    // 26. Remove Duplicates from Sorted Array
    public static int RemoveDuplicates(int[] nums){
        int j = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[j]) {
                j ++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    // 27. Remove Element
    public static int RemoveElement(int[] nums, int val){
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j ++;
            }
        }
        return j;
    }

    //35. Search Insert Position
    public static int BinaryS(int[] nums, int val){
        int l = 0;
        int r = nums.length-1;
        int i = 0;
        if (l == r)
            if (nums[r] >= val)
                return 0;
            else
                return 1;
        if (nums[r] < val)
            return r + 1;
        if (nums[l] > val)
            return 0;
        while (l < r){
            i = (l + r) / 2;
            if (nums[i] == val){
                return i;
            }
            if (nums[i] < val)
                l = i + 1;
            else
                r = i - 1;
        }
        return l + 1;
    }

    // 283. Move Zeroes
    public static void MoveZeroes(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j ++;
            }
        }
        for (int i = j; i < nums.length; i++)
            nums[i] = 0;
    }
}


