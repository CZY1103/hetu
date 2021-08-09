import java.util.Scanner;

/**
 * 对01字符串进行一些操作，01字符串上的0和0相邻时会变成1，而1和1相邻时会在字符串上消失，而0和1相邻时什么都不会发生
 * 问这个字符串最后会变成什么样。
 */
public class Game01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s;
        while(true){
            int i = 0;
            String m = "";
            while(i < s.length()) {
                if (i!=s.length()-1) {
                    if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == '0') {
                        m = s.substring(0, i) + '1' + s.substring(i + 2, s.length() );
                        break;
                    } else if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == '1') {
                        m = s.substring(0, i) + s.substring(i + 2, s.length());
                        break;
                    } else {
                        i++;
                    }
                }else{
                    m = s;
                    break;
                }
            }
            str = m;
            if (str.equals(s)){
                break;
            }
            s = m;
        }
        System.out.println(s);
    }
}
