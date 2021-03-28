import java.util.Scanner;

public class NumbersTotals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int n = sc.nextInt();
        while(n >= 0){
            int m = n%10;
            array[m]++;
            n=n/10;
        }
        for(int i = 0;i <=9;i++){
            if(array[i]!=0){
                System.out.print(i+":"+array[i]+" ");
            }
        }
        System.out.println();
    }
}
