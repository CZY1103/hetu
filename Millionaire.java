public class Millionaire {
    public static Integer Poor(int n){
        if (n==1){
            return 1;
        }
        return 2*Poor(n-1);
    }
    public static Integer thePoor(int n){
        if (n==1){
            return 1;
        }
        return Poor(n)+thePoor(n-1);
    }
    public static void main(String[] args) {
        System.out.println(30*10+" "+thePoor(30));
    }
}
