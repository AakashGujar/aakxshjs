public class ValidPalindrome {
        public boolean isPalindrome(String s) {
            // edge case
            if (s.isEmpty())
                return true;
    
            int i = 0;
            int j = s.length() - 1;
    
            while (i < j) {
                while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                    i++;
                }
                while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                    j--;
                }
                if (i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                    return false;
                }
    
            }
                return true;
        }
}
