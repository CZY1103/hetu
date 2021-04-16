public class GoUpstairs {
    public static int countWays(int n) {
        long[] count = {1,2,4};
        if(n<=0){
            return 0;
        }else if(n<=3){
            return (int)count[n-1];
        }else{
            for(int i =4;i <= n;i++){
                long temp = (count[0]+count[1]+count[2])%1000000007;
                count[0]=count[1];
                count[1]=count[2];
                count[2]=temp;
            }
        }
        return (int)count[2];
    }

    public static void main(String[] args) {
        System.out.println(countWays(5));
    }
}
