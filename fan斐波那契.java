public class fan斐波那契 {
    public static void main(String[] args) {
        System.out.println(isfib(8));
        System.out.println(timefib(15));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(13/2+1));
    }
    public static int timefib(int m){//次数
        int y=0;
        if (!isfib(m)){
            while(isfib(m)){
                m=m-1;
                y++;
            }
        }
        return y;
    }
    public static boolean isfib(int x){
        int b=2*x;
        while(b==0) {
            if (x == fibonacci(b)) {
                return true;
            }else {
                b=b-1;
            }
        }
        return false;
    }
    public static int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
