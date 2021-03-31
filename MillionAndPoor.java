public class MillionAndPoor {
    public static long poorMoney(long n){
        if(n==1){
            return 1;
        }
        return poorMoney(n-1)+everyday(n);
    }
    public static long everyday(long n){
        if(n == 1){
            return 1;
        }
        return 2*everyday(n-1);
    }
    public static void main(String[] args){
        System.out.println(300+" "+poorMoney(30));
    }
}
