public class StringPlalindrome {
    public static boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            while((!((c[start] >= 'a' && c[start] <= 'z')  || (c[start] >= '0' && c[start] <= '9')))&&start<end){
                start++;
            }
            while ((!((c[end] >= 'a' && c[end] <= 'z')  || (c[end] >= '0' && c[end] <= '9')))&&start<end) {
                end--;
            }
            if (c[start] == c[end] ) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
