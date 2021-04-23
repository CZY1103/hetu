import java.util.ArrayList;

public class RotationMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(matrix.length==0){
            return arr;
        }
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(top<(matrix.length+1)/2&&left<(matrix[0].length+1)/2){
            for(int i = left;i <= right;i++){
                arr.add(matrix[top][i]);
            }
            for(int i = top+1;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            for(int i = right-1;top!=bottom&&i>=left;i--){
                arr.add(matrix[bottom][i]);
            }
            for(int i = bottom-1;left!=right&&i>=top+1;i--){
                arr.add(matrix[i][left]);
            }
            ++top;
            --bottom;
            ++left;
            --right;
        }
        return arr;
    }
}
