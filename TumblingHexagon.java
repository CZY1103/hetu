import java.util.Scanner;

public class TumblingHexagon {
    public static double radian(int k){
        switch (k) {
            case 1:
                return 2 * Math.PI/6;
            case 2:
                return 2*Math.PI*Math.sqrt(3)/6;
            case 3:
                return 2*Math.PI*2/6;
        }
        return 0;
    }
    public static double radianAll(int k){
        switch (k) {
            case 1:
                return radian(1);
            case 2:
                return radian(1)+radian(2);
            case 3:
                return radian(1)+radian(2)+radian(3);
            case 4:
                return radian(1)+radian(2)*2+radian(3);
            case 5:
            case 6:
                return radian(1)*2+radian(2)*2+radian(3);
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = k%6;
        int m = k/6;
        if (n==0){
            System.out.println(radianAll(6)*m);
        }else{
            System.out.println(radianAll(6)*m+radianAll(n));
        }

    }
}
