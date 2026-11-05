class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int twoSum = numbers[l] + numbers[r];
            if (twoSum > target) {
                r--;
                continue;
            } else if (twoSum < target) {
                l++;
                continue;
            } else {
                int firstIdx = l + 1;
                int secondIdx = r + 1;
                int[] result = {firstIdx, secondIdx};
                return result;
            }
        }
        return new int[2];
    }
}
