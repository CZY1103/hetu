public class LongestCommonSubstring {
    /**
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串
     */
    public String LCS (String str1, String str2) {
        //记录最长公共子串的长度
        int maxLenth = 0;
        //记录最长公共子串的最后一个位置的下标
        int maxLastIndex = 0;
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i = 0 ;i < str1.length();i++){
            for(int j = 0 ;j < str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + 1;
                    if(dp[i+1][j+1]>maxLenth){
                        maxLenth = dp[i+1][j+1];
                        maxLastIndex = i;
                    }
                }else{
                    dp[i+1][j+1]=0;
                }
            }
        }
        return str1.substring(maxLastIndex-maxLenth + 1,maxLastIndex+1);
    }
}
