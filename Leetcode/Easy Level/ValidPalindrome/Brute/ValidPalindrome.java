class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // edge case
        if (s.isEmpty())
            return true;

        s = s.toLowerCase();

        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                t.append(s.charAt(i));
            }
        }

        int j = t.length() - 1;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != t.charAt(j - i)) {
                return false;
            }
        }
        return true;
    }
}