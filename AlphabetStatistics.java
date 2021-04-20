import java.util.Scanner;

public class  AlphabetStatistics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            char[] ch = str.toCharArray();
            int[] count = new int[26];
            for(int i = 0;i <ch.length;i++){
                if(ch[i]>='A'&&ch[i]<='Z'){
                    count[ch[i]-'A']++;
                }
            }
            for(int i = 0;i < 26;i++){
                System.out.printf("%c:%d\n",i+'A',count[i]);
            }
        }
    }
}
