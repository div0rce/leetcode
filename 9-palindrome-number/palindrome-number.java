class Solution {
    public boolean isPalindrome(int x) {
        String xToString = x + "";
        if (xToString.contains("-")) {
            return false;
        }
        int xLength = xToString.length();
        if (xLength == 1){
            return true;
        }
        int xMid = xLength / 2;

        String leftSide, rightSide = "";

        if (xLength % 2 == 0) {
            leftSide = xToString.substring(0,xMid);
            rightSide = xToString.substring(xMid);
        }
        else {
            leftSide = xToString.substring(0,xMid);
            rightSide = xToString.substring(xMid + 1);
        }

        char ch;
        String reversed = "";
        for (int i = 0; i < rightSide.length(); i++){
            ch = rightSide.charAt(i);
            reversed = ch + reversed;
        }

        if(leftSide.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }
}
