public class MatrixElementLookup {
    public int[] findElement(int[][] mat, int n, int m, int x) {
        int[] arr = new int[2];
        int i = 0;
        int j = m-1;
        while(i < n || j >=0){
            if(mat[i][j]>x){
                j--;
            }else if(mat[i][j]<x){
                i++;
            }else{
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
        }
        return new int[]{-1,-1};
    }
}
