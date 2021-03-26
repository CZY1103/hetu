import java.util.Scanner;

public class MinTogetherMultiple {
    public static int minBeiShu(int x,int y){
        int i = x;
        int j = y;
        if(x < y){
            int t = x;
            x = y;
            y = t;
        }
        int m = 0;
        while(x%y>0){
            m = x%y;
            x = y;
            y = m;
        }
        return y*(i/y)*(j/y);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(minBeiShu(x,y));
    }
}
