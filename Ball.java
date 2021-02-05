import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.acos;

public class Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ball = new int[6];
        for (int i = 0;i < 6;i ++){
            ball[i]=sc.nextInt();
        }
        int c = ball[3]-ball[0];
        int k = ball[4]-ball[1];
        int g = ball[5]-ball[2];
        double r = Math.sqrt(c*c+k*k+g*g);
        double s = ((double)4/3)*acos(-1)*r*r*r;
        System.out.printf("%.3f"+" "+"%.3f",r,s);
    }
}
