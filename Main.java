import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 2, 7, 11, 15 };
        int target1 = 9;
        int[] nums2 = new int[] { 3, 2, 4 };
        int target2 = 6;
        int[] nums3 = new int[] { 3, 3 };
        int target3 = 6;

        Solution solutionObj = new Solution();

        System.out.println(Arrays.toString(solutionObj.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(solutionObj.twoSum(nums2, target2)));
        System.out.println(Arrays.toString(solutionObj.twoSum(nums3, target3)));


    }
}