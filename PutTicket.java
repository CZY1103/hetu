import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PutTicket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] Candidate = new String[n];
            HashMap<String,Integer> hs = new HashMap<String,Integer>();
            for(int i = 0;i < n;i++){
                String s = sc.next();
                hs.put(s,0);
                Candidate[i]=s;
            }
            int m = sc.nextInt();
            Set<String> keys = hs.keySet();
            int cnt = 0;
            for(int i = 0;i < m;i++){
                String ticket = sc.next();
                if(keys.contains(ticket)){
                    hs.put(ticket,hs.get(ticket)+1);
                }else{
                    cnt++;
                }
            }
            for(String k:Candidate){
                System.out.println(k+" : "+hs.get(k));
            }
            System.out.println("Invalid : "+cnt);
        }
    }
}
