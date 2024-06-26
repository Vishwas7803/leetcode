import java.util.Arrays;

class Solution {
    private int ans = 0;
    private int mx = Integer.MAX_VALUE;
    
    private void Solve(int[] nums, int x, int i, int T) {
        int n = nums.length;
        int L = i;
        int R = n - 1;
        while (L < R) {
            int val = (nums[x] + nums[L] + nums[R]);
            if (Math.abs(T - val) < mx) {
                ans = val;
                mx = Math.abs(T - val);
            } else if (val > T) {
                R--;
            } else {
                L++;
            }
        }
    }
    
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                Solve(nums, i, i + 1, target);
            }
        }
        return ans;
    }
}