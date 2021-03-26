import java.util.Scanner;

public class WHCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int WCount1 = W/4+(W%4<2?W%4:2);
        int WCount2 = (W-2)/4+((W-2)%4<2?(W-2)%4:2);
        int WCount = (WCount1+WCount2)*2;
        int HCount = (H/4)*WCount;
        if (H%4>0){
            HCount = HCount+WCount1;
        }
        if (H%4>1){
            HCount = HCount+WCount1;
        }
        if (H%4>2){
            HCount = HCount+WCount2;
        }
        System.out.println(HCount);
    }
}
