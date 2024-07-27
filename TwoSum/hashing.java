package TwoSum;

import java.util.HashSet;

public class hashing {
    /**
     * @param args
     * O(N) -- Time complexity
     * o(N) -- Space complexity
     */
    public static void main(String[] args) {

        int[] intArray = new int[] { 1, 2, 3 };
        twoSum(intArray, 5);
    }

    public static void twoSum(int[] nums, int target) {

        int numsLen = nums.length;

        HashSet set = new HashSet<>();

        for (int i = 0; i < numsLen; i++) {
            int temp = target - nums[i];

            if (set.contains(temp)) {
                System.out.println("Numbers are " + temp + "and" + nums[i]);
                return;
            }
            set.add(nums[i]);
        }
    }
}
