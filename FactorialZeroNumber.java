import java.util.Scanner;

public class FactorialZeroNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for(int i = n;i>=5;i--){
            int tem = i ;
            while(tem%5==0){
                s++;
                tem /=5;
            }
        }
        System.out.println(s);
    }
}
