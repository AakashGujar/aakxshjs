class Solution {
    public boolean isValid(String s) {
        Deque<String> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            String current = String.valueOf(s.charAt(i));

            if (current.equals("(") || current.equals("[") || current.equals("{")) {
                deque.push(current);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }

                String last = deque.pop();

                if (current.equals(")") && !last.equals("(")) {
                    return false;
                }
                if (current.equals("]") && !last.equals("[")) {
                    return false;
                }
                if (current.equals("}") && !last.equals("{")) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}