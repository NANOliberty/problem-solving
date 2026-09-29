class Solution {
    public boolean isPalindrome(String s) {
        int left_pointer = 0;
        int right_pointer = s.length() - 1;

        while (left_pointer < right_pointer) {
            char lc = s.charAt(left_pointer);
            char rc = s.charAt(right_pointer);

            if (!Character.isLetterOrDigit(lc)) {
                left_pointer++;
                continue;
            }

            if (!Character.isLetterOrDigit(rc)) {
                right_pointer--;
                continue;
            }

            else {
                if (Character.toLowerCase(lc) == (Character.toLowerCase(rc))) {
                    if (left_pointer == right_pointer) return true;
                    left_pointer++;
                    right_pointer--;
                }
                else return false;
            }   
        }

        return true;
    }
}