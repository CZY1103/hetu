public class Sqrt {
    public int sqrt (int x) {
        if(x<=0){
            return 0;
        }
        int left = 1;
        int right = x;
        while(left<right){
            long mid = (left+right)/2;
            if(mid*mid<=x && (mid+1)*(mid+1)>x){
                return (int)mid;
            }else if(mid*mid>x){
                right =(int)mid;
            }else if((mid+1)*(mid+1)<x){
                left = (int)mid;
            }
        }
        return left;
    }
}
