public class HitBoss {
    public static int maxFactor(int a,int b) {
        if(a<b){
            int t=a;
            a=b;
            b=t;
        }
        int c = a % b;
        if (c == 0) {
            return b;
        }
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
    public static int ability(int n,int a,int[] b){
        for(int i=0;i<n;i++){
            if(b[i]<a){
                a=a+b[i];
            }else{
                a=a+maxFactor(a,b[i]);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n=3;
        int a=50;
        int[] b={50,105,200};
        System.out.println(ability(n,a,b));
    }
}
