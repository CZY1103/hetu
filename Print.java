import java.util.Scanner;

public class Print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length;i++){
            if(ch[i]!='<'){
                sb.append(ch[i]);
            }else{
                if(sb.length()!=0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
