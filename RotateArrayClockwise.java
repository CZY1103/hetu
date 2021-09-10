public class RotateArrayClockwise {
    public int[][] rotateMatrix(int[][] mat, int n) {
        int[][] res = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j =0 ;j < n;j++){
                res[j][n-i-1] = mat[i][j];
            }
        }
        return res;
    }
}
