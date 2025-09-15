package Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        int[] a = {1, 4, 5, 6, 7, 9, 10};
        int target = 10;
        System.out.println("Array contain 2 value have value " + target + " is: ");
        System.out.println(Arrays.toString(twoSumHashMap(a, target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int indexOfI = i;
                    int indexOfJ = j;
                    int[] res = new int[2];
                    res[0] = indexOfI;
                    res[1] = indexOfJ;
                    return res;
                }
            }
        }
        return null;
    }

    public static int[] twoSumHashMap(int[] nums, int target) {

        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }
        return new int[]{0};
    }
}
