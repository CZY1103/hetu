import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeadContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String have = sc.nextLine();
        String need = sc.nextLine();
        //商人
        Map<Character,Integer> h = new HashMap<>();
        for (char c: have.toCharArray()){
            if (h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }else{
                h.put(c,1);
            }
        }
        //我需要
        Map<Character,Integer> n = new HashMap<>();
        for (char c: need.toCharArray()){
            if (n.containsKey(c)){
                n.put(c,n.get(c)+1);
            }else{
                n.put(c,1);
            }
        }
        boolean weather = true;
        int lack = 0;
        for (Map.Entry<Character,Integer> en :n.entrySet()){
            char k = en.getKey();
            int v = en.getValue();
            if (h.containsKey(k)&&h.get(k)<v){
                weather = false;
                lack += v-h.get(k);
            }else if(!h.containsKey(k)){
                weather = false;
                lack +=v;

            }
        }
        if (weather){
            System.out.println("yes"+ (have.length()-need.length()));
        }else{
            System.out.println("no"+lack);
        }
    }
}
