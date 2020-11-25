public class Antiorder {
    public int count(int[] A,int n){
        int i = 0;
        int count = 0;
        for(i=0;i<n;i++){
            int j = 0;
            for(j = i;j<n;i++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
