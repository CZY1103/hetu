import java.util.Scanner;

public class EnglishOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.toString();
        char[] s = S.toCharArray();
        int i = 0;
        int j = s.length;
        while(i<j){
            if (s[i]!=' '){
                i++;
            }
            if (s[j]!=' '){
                j--;
            }
        }
    }
}
