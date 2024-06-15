class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numString = strs.length;
        int longestLength = strs[0].length();
        for (int i = 1; i < numString; i++) {
            if (strs[i].length() > longestLength) {
                longestLength = strs[i].length();
            }
        }

        char[][] strs2D = new char[numString][longestLength];
        for (int i = 0; i < numString; i++) {
            for (int j = 0; j < longestLength; j++) {
                if (j < strs[i].length()) {
                    strs2D[i][j] = strs[i].charAt(j);
                } else {
                    strs2D[i][j] = ' ';
                }
            }
        }

        String longestPrefix = "";
        boolean isCommon = true;
        for (int i = 0; i < longestLength; i++) {
            for (int j = 0; j < numString - 1; j++) {
                if (strs2D[j][i] != strs2D[j + 1][i]) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                longestPrefix += strs2D[0][i];
            } else {
                break;
            }
        }

        return longestPrefix.strip();

    }
}