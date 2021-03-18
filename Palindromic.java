import java.util.Scanner;

public class Palindromic {
    public static boolean isHuiWen(String s){
        int i = 0;
        int j = s.length()-1;
        while (i < j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = 0;
        for (int i = 0; i<=a.length();i++){
            StringBuilder sb = new StringBuilder(a);
            sb.insert(i,b);
            if (isHuiWen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
