import java.util.Scanner;

public class CycleMovesRight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split(",|\"");
        String x = str[1];
        int y = Integer.parseInt(str[3]);
        int n = x.length();
        String s1 = x.substring(0,n-y);
        String s2 = x.substring(n-y,n);
        String newstr = s2+s1;
        long m =Long.parseLong(newstr,2);
        System.out.println(m);
    }
}
