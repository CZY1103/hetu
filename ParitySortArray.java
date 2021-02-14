public class ParitySortArray {
    public static int[] sortArrayByParity(int[] A) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0;i < A.length;i++){
            if (A[i]%2==0){
                even.append(A[i]);
            }else{
                odd.append(A[i]);
            }
        }
        char[] o = odd.toString().toCharArray();
        char[] e = even.toString().toCharArray();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<A.length){
            if(i<e.length){
                A[i]=e[j]-'0';
                j++;
            }else{
                A[i]=o[k]-'0';
                k++;
            }
            i++;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A={0,2,4,6,8,10};
        int[] B=sortArrayByParity(A);
        for (int i =0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
    }
}
