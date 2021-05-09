public class ReverseNumber {
    public static int reverse (int x){
        int res = 0;
        while(x!=0){
            int t = x%10;
            int newNumber = res*10+t;
            if ((newNumber-t)/10!=res){
                return 0;
            }
            res = newNumber;
            x= x/10;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
