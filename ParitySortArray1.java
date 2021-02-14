public class ParitySortArray1 {
    public static int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length-1;
        while(start<end){
            if (A[start]%2==0){
                start++;
            }else if (A[end]%2!=0){
                end--;
            }else {
                int m = A[start];
                A[start] = A[end];
                A[end] = m;
                start++;
                end--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A={0,6,4,3,1,9,5,7};
        int[] B=sortArrayByParity(A);
        for (int i =0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
    }
}
