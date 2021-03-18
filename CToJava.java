import java.util.Scanner;

public class CToJava {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String s = sc.nextLine();
                StringBuilder sb = new StringBuilder();
                char[] c = s.toCharArray();
                for (int i = 0; i < c.length; i++) {
                    if (c[i] == '_') {
                        i++;
                        sb.append(String.valueOf(c[i]).toUpperCase());
                        continue;
                    }
                    sb.append(c[i]);
                }
                System.out.println(sb);
            }
        }
}
