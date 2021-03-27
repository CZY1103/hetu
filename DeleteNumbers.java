import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n > 1000){
                n = 999;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for( int i = 0;i < n;i++){
            list.add(i);
        }
        int i = 0;
        while(list.size()>1){
            i = (i+2)%list.size();
            i++;
        }
        System.out.println(list.get(0));
    }
}
