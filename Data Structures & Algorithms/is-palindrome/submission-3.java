class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        boolean oneCharDel = false;
        while (start < end) {
            while (start < end && !isAlphaNum(arr[start])) {
                start++;
            }
            while (start < end && !isAlphaNum(arr[end])) {
                end--;
            }
            if (Character.toLowerCase(arr[start]) == Character.toLowerCase((arr[end]))) {
                start++;
                end--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphaNum(char c) {
        return
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9') ||
                (c >= 'a' && c <= 'z');
    }
}
