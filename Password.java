import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c.length; i++) {
                if (c[i] != ' ') {
                    int p = (c[i] - 'A' - 5) % 26;
                    if (p >= 0) {
                        sb.append((char) ('A' + (c[i] - 'A' - 5) % 26));
                    } else {
                        sb.append((char) ('A' + (c[i] - 'A' - 5) % 26 + 26));
                    }
                }else{
                    sb.append(' ');
                }
            }
            System.out.println(sb);
        }
    }
}