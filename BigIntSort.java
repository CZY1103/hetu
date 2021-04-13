import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigIntSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            BigInteger[] l = new BigInteger[n];
            for(int i = 0;i < n;i++){
                l[i]=sc.nextBigInteger();
            }
            Arrays.sort(l);
            for(int i = 0;i < n;i++){
                System.out.println(l[i]);
            }
        }
    }
}
