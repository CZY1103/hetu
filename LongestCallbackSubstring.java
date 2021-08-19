public class LongestCallbackSubstring {
    /**
     * 暴力解法
     */
//    public int getLongestPalindrome(String A, int n) {
//        int max = 0;
//        for(int i = 0;i < n;i++){
//            for(int j = i+1; j <= n ;j++){
//                String s = A.substring(i,j);
//                if(isPalindrome(s)&&s.length()>max){
//                    max = s.length();
//                }
//            }
//        }
//        return max;
//    }
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
