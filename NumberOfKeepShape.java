import java.util.Scanner;

public class NumberOfKeepShape {
    public static boolean numberOfKeep(int n){
        if(n<2 || n>=100){
            return false;
        }
        int m = n*n;
        int y = 0;
        int z = 0;
        int x = 2;
        int a = 1;
        if(n>=10) {
            while (x != 0) {
                y = m % 10;
                z = z + y * a;
                a = a * 10;
                m = m / 10;
                x--;
            }
        }else{
            z = m%10;
        }
        if(z==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(sc.hasNextInt()) {
            n = sc.nextInt();
            if (numberOfKeep(n)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
