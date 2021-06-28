public class NiuWaterProblem {
    public static int sumFactor(int n){
        int m = 0;
        for(int i = 1;i <= Math.sqrt(n);i++){
            if(n%i==0){
                int s = n/i;
                if(i!=s){
                    m = m+i+s;
                }else{
                    m = m+i;
                }
            }
        }
        return m;
    }
    public static int doQuestion (int n) {
        int s = 0;
        for(int i = 1;i <=n; i++){
            double x = (double) (sumFactor(i)/i);
            if(x<2){
                s = s+i;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(doQuestion(5));
    }
}
