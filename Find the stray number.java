import java.util.Arrays;

class Solution {
  static int stray(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i += 2) {
      if (nums[i] != nums[i - 1]) {
        return nums[i - 1];
      }
    }
    return nums[nums.length - 1];
  }
}
