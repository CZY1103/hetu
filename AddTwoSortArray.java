public class AddTwoSortArray {
    public static void merge(int A[], int m, int B[], int n) {
        int i = m-1;
        int j = n-1;
        for(int k = m+n-1;i>=0&&j>=0;k--){
            A[k] = A[i]>B[j]?A[i--]:B[j--];
        }
        while(j>=0){
            A[j] = B[j--];
        }
    }
}
