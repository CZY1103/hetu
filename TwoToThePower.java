public class TwoToThePower {
    public String solve (int n) {
        int temp = 1;
        while(temp<=n-7){
            if(temp == n-7){
                return "YES";
            }
            temp = temp*2;
        }
        return "NO";
    }
}
