public class GoodNumber {
    public boolean judge (int x) {
        if(x<10){
            return true;
        }
        int m = x%10;
        while(x>=10){
            x = x/10;
        }
        if(x==m){
            return true;
        }else{
            return false;
        }
    }
}
