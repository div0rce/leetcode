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

        // StringBuilder temp = new StringBuilder();
        // for (int i = notEmpty.length() - 1; i >= 0; i--){
        //     temp.append(notEmpty.charAt(i));
        // }
        // notEmpty = temp.toString();

        return notEmpty.length();
    }
}