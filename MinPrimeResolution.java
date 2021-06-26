public class MinPrimeResolution {
    /**
     当N > 3且N为偶合数时，N本身不是素数，根据哥德巴赫猜想，答案肯定为2
     当N > 3且N为奇合数时，如果答案为2，因为N为奇数，因此只能拆解成奇数 + 偶数，
     而偶质数只有2，因此只需要判断N - 2是不是质数即可
     **/
    public int MinPrimeSum (int N) {
        if(isPrime(N)){
            return 1;
        }
        if(N%2==0 || isPrime(N-2)){
            return 2;
        }
        return 3;
    }
    public static boolean isPrime(int n ){
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
