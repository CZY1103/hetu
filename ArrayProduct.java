public class ArrayProduct {
    public int[] multiply(int[] A) {
        if(A.length==1){
            return null;
        }
        int[] B = new int[A.length];
        for(int i = 0 ;i < B.length;i++){
            B[i]=1;
        }
        for(int i = 0; i< B.length;i++){
            for(int j = 0;j <A.length;j++){
                if(i!=j){
                    B[i]=A[j]*B[i];
                }
            }
        }
        return B;
    }
}
