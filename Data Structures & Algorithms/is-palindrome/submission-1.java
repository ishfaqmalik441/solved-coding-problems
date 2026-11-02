class Solution {
    public boolean isPalindrome(String str) {
        str = str.trim();
        String delims = "\\W+";
        var arr_str = str.split(delims);
        String str2 = String.join("", arr_str);
        var start = 0;
        var end = str2.length() - 1;
        var isPalindrome = true;
        str2 = str2.toLowerCase();
        while(start < end) {
            if (str2.charAt(start) == str2.charAt(end)) {
                start++;
                end--;
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            return true;
        } else {
            return false;
        }
    }
}
