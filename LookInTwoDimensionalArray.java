public class LookInTwoDimensionalArray {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        if(row == 0||col == 0){
            return false;
        }
        int r = 0;
        int c = col-1;
        while(r < row && c>=0){
            if(target==array[r][c]){
                return true;
            }else if(target>array[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
