import java.util.Scanner;

public class HogwartsLooseChange {
    public static String looseChange(String zong,String fu){
        int[] zhao = new int[3];
        String[] zong1 = zong.split("\\.");
        String[] fu1 = fu.split("\\.");
        StringBuffer sb = new StringBuffer();
        if (Integer.parseInt(zong1[2]) > Integer.parseInt(fu1[2])) {
            zhao[2] = Integer.parseInt(fu1[2]) + 29 - Integer.parseInt(zong1[2]);
            fu1[1] = String.valueOf(Integer.parseInt(fu1[1])-1);
        } else {
            zhao[2] = Integer.parseInt(fu1[2])  - Integer.parseInt(zong1[2]);
        }
        if (Integer.parseInt(zong1[1]) > Integer.parseInt(fu1[1])) {
            zhao[1] = Integer.parseInt(fu1[1]) + 17 - Integer.parseInt(zong1[1]);
            fu1[0] = String.valueOf(Integer.parseInt(fu1[0])-1);
        } else {
            zhao[1] = Integer.parseInt(fu1[1])  - Integer.parseInt(zong1[1]);
        }
        if (Integer.parseInt(zong1[0]) > Integer.parseInt(fu1[0])) {
            sb.append("-");
            sb.append(looseChange(fu,zong));
        } else {
            zhao[0] = Integer.parseInt(fu1[0])  - Integer.parseInt(zong1[0]);
            for (int i = 0;i <3 ;i++){
                sb.append(zhao[i]);
                if (i!=2){
                    sb.append(".");
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zong = sc.next();
        String fu = sc.next();
        System.out.println(looseChange(zong,fu));
    }
}
