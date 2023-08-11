
public class Solution {
    public Solution() {
        super();
    }
    
    public int[] twoSum(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums.length; y++) {
                if (y == x)
                    continue;

                if (nums[x] + nums[y] == target) {
                    System.gc();
                    return new int[] { x, y };
                }
            }
        }

        return new int[]{};
    }
}
