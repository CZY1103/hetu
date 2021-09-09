import java.util.Arrays;

public class OddBeforeEvenArray {
    public static int[] reOrderArray (int[] array) {
        int i = 0;
        int j = 0;
        while(i<array.length&&j<array.length){
            if(array[i]%2==1){
                int temp = array[i];
                for(int m = i-1;m >=j;m--){
                    array[m+1]=array[m];
                }
                array[j] = temp;
                j++;
            }
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
