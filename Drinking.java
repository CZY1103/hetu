public class Drinking {
    public static int countWine (int m, int n) {
        int s = n/m;
        int a = s;
        int b = s;
        while(a/2>0||b/4>0){
            int i = a/2+b/4;
            s = s+i;
            a = a%2+i;
            b = b%4+i;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(countWine(2,12));
    }
}
