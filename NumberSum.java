import java.util.Scanner;

public class NumberSum {
    public static int sum(int n){
        int m = 0;
        int sum = 0;
        while(n!=0){
            m = n%10;
            n = n/10;
            sum = sum + m;
        }
        return sum;
    }
    public static int squareSum(int n){
        int m = 0;
        int sum = 0;
        n = n*n;
        while(n!=0){
            m = n%10;
            n = n/10;
            sum = sum + m;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.printf(sum(n) + " " + squareSum(n));
        }
    }
}
