import java.util.Scanner;

public class StringFind {
    public static int S(String s,char m){
        int x = 0;
        char[] c = s.toCharArray();
        for (int i = 0;i<c.length;i++){
            if (c[i]==m){
                x++;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        for (char i = 'A';i<='Z';i++) {
            System.out.printf("%s"+":"+"%d",i,S(s,i));
            System.out.println();
        }
    }
}
