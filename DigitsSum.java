import java.util.Scanner;

public class DigitsSum {
    public static long res = 0;

    /**
     *
     * @param n
     * @param m
     * @param index 第几次迭代
     * @param v  前index位上的和
     * @param cur 前index的和
     */
    public static void slove(int n,int m,int index,int v,int cur){
        if(m-v<0){
            return;
        }
        if(index == n-1){
            if(m-v<10){
                res+=cur*10+m-v;
                return;
            }else{
                return;
            }
        }
        if(index == 0){
            for(int i =1;i<=9;i++){
                slove(n,m,index+1,v+i,cur*10+i);
            }
        }else{
            for(int i=0;i<=9;i++){
                slove(n,m,index+1,v+i,cur*10+i);
            }
        }
    }
    public static long sum(int n, int m){
        slove(n,m,0,0,0);
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(",");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        System.out.println(sum(n,m));
    }
}
