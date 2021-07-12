public class ReserveNumber {
    public static boolean isPalindrome (int x) {
        if(x < 0){
            return false;
        }
        int temp = x;
        int y = 0;
        while(temp>0){
            y = y*10+temp%10;
            temp = temp/10;
        }
        return x==y;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(2146556412));
    }
}
