import java.util.Scanner;

public class NicoCjester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = n;
            int[] array = new int[n];
            array[0]= n*(n-1)+1;
            int j = 1;
            while(n>1){
                array[j]=array[j-1]+2;
                n--;
                j++;
            }
            String[] s = new String[m];
            for(int i = 0;i < m;i++){
                s[i]= String.valueOf(array[i]);
            }
            for (int i = 0;i < m-1;i++){
                System.out.print(s[i]+"+");
            }
            System.out.println(s[m-1]);
        }
    }
}
