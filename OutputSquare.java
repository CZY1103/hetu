import java.util.Scanner;

public class OutputSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for(int i = 1;i <=n;i++ ){
            System.out.print(s);
        }
        System.out.println();
        for(int i = 1;i<=Math.ceil((double)n/2)-2;i++){
            System.out.print(s);
            for(int j = 2;j < n;j++){
                System.out.print(" ");
            }
            System.out.print(s);
            System.out.println();
        }
        for(int i = 1;i <=n;i++ ){
            System.out.print(s);
        }
        System.out.println();
    }
}
