public class StringLongestCommon {
    public static String longestCommonPrefix (String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String maxCammom = strs[0];
        for(int i = 1;i < strs.length;i++){
            for(int j = 0;j < Math.min(maxCammom.length(),strs[i].length());j++){
               if(maxCammom.charAt(j)!=strs[i].charAt(j)){
                    maxCammom = maxCammom.substring(0,j);
                    break;
                }
            }
            if (maxCammom.length()<strs[i].length()){
                maxCammom = maxCammom;
            }else{
                maxCammom = strs[i];
            }
        }
        return maxCammom;
    }

    public static void main(String[] args) {
        String[] strs = {"aaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaa","aaaaaaaaaaaaaaaa"};
        System.out.println(longestCommonPrefix(strs));
    }
}
