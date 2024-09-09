class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = 0;

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        for (int freq : count) {
            length += (freq / 2) * 2;
            if (length % 2 == 0 && freq % 2 == 1) {
                length++;
            }
        }
        return length;
    }
}