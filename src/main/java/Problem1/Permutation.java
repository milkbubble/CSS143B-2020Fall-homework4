package Problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length <= 0) {
            return Arrays.asList(Collections.emptyList());
        }
        permute(nums, 0, result);
        return result;

    }
    private static void permute(int[] nums, int position, List<List<Integer>> result) {
        if (position == nums.length - 1) {
            List<Integer> oneLeft = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                oneLeft.add(nums[i]);
            }
            result.add(oneLeft);
            return;
        }
        for (int i = position; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;
            permute(nums, position + 1, result);
            temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;
        }
    }
}
