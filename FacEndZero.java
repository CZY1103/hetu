

public class FacEndZero {
        public static long jacking(long n){
                if(n==0||n==1){
                    return 1;
                }else{
                    return n *jacking(n-1);
                }
            }
            public static int zeroCounts(int n){
                long m = jacking(n);
                long t = 10;
                int count = 0;
                while(m%t!=m){
                    long s = m%t;
                    if(s==0){
                        count++;
                    }
                    t =t*10;
                    if(s!=0){
                        break;
                    }
                }
                return count;
            }

    public static void main(String[] args) {

        System.out.println(zeroCounts(15));
    }

}
