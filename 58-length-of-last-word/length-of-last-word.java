class Solution {
    public int lengthOfLastWord(String s) {
        String notEmpty = "";
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) != ' ') {
                notEmpty = notEmpty + s.charAt(i);
            }
            if (!notEmpty.isEmpty() && s.charAt(i) == ' '){
                break;
            }
        }

        return notEmpty.length();
    }
}