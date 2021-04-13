import java.util.Scanner;

public class AnnualMeetingLottery {
    public static float jiecheng(int i){
        float result = 1;
        if(i==0||i==1){
            result = 1;
        }else {
            result = jiecheng(i - 1) * i;
        }
        return result;
    }
    /**
     错排算法
     **/
    public static float count(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }
        return (n-1)*(count(n-1)+count(n-2));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            double sum = 0;
            float m = jiecheng(n);
            float c = count(n);
            sum = (double)(c/m)*100;
            System.out.println(m);
            System.out.println(c);
            System.out.println(jiecheng(n));
            System.out.println(String.format("%.2f",sum)+"%");
        }
    }
}
