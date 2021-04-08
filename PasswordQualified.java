import java.util.Scanner;

public class PasswordQualified {
    public static boolean Length(String s){
        if(s==null||s.length()<=8){
            return false;
        }
        return true;
    }
    public static boolean Type(String s){
        int num = 0;
        int lower = 0;
        int upper = 0;
        int others = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i< ch.length;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                num = 1;
                continue;
            }else if(ch[i]>='a'&&ch[i]<='z'){
                lower = 1;
                continue;
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                lower = 1;
                continue;
            }else{
                others = 1;
                continue;
            }
        }
        int total = num+lower+upper+others;
        return total>=3?true:false;
    }
    public static boolean SameLength(String s){
        for(int i = 0;i < s.length()-2;i++){
            String str1 = s.substring(i,i+3);
            if(s.substring(i+1).contains(str1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(Length(s) && Type(s) && SameLength(s)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
}
