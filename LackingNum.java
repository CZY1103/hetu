public class LackingNum {
    public int solve (int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x = x ^ a[i] ^ (i + 1);
        }
        return x;
    }
//    public int solve (int[] a) {
//        int sum = 0;
//        for(int i = 0;i <=a.length;i++){
//            sum +=i;
//        }
//        for(int i = 0;i <a.length;i++){
//            sum-=a[i];
//        }
//        return sum;
//    }

//    public int solve (int[] a) {
//        int i = 0;
//        for(i = 0;i <a.length;i++){
//            if(i!=a[i]){
//                break;
//            }
//        }
//        return i;
//    }
}
