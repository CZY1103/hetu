import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static int[] LIS (int[] arr) {
        List<Integer> result = new ArrayList<>();
        int[] maxLength = new int[arr.length];
        for (int i = 0 ; i<arr.length;i++ ){
            if (result.size() > 0){
                if (result.get(result.size()-1) < arr[i]){
                    result.add(arr[i]);
                    maxLength[i] = result.size();
                }else{
                    for (int j = result.size() - 1 ; j >= 0 ; j--){
                        if (result.get(j) < arr[i]){
                            result.set(j+1,arr[i]);
                            maxLength[i] = j + 2;
                            break;
                        }
                        if (j == 0){
                            result.set(0,arr[i]);
                            maxLength[i] = 1;
                        }
                    }
                }
            }else {
                result.add(arr[i]);
                maxLength[i] = 1;
            }
        }
        int[] resultArray = new int[result.size()];

        for (int i = arr.length -1 , j = result.size(); j > 0; i-- ){
            if (maxLength[i] == j){
                resultArray[--j] = arr[i];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,8,6,5,2,5};
        int[] arr1 = LIS(arr);
        System.out.println(Arrays.toString(arr1));
    }
}
