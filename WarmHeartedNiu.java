public class WarmHeartedNiu {
    public long Maximumcandies (long n, long k) {
        long s = k/(n+1);
        long m = k-((n+1)*s);
        if(m%n==0){
            return s;
        }else{
            return (long)(s-1);
        }
    }
}
