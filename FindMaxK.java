import java.util.Arrays;

public class FindMaxK {
    public static int findKth(int[] a, int n, int K) {
        quickSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
        return a[K-1];
    }
    public static void quickSort(int[] a,int lowIndex,int highIndex){
        int size = highIndex - lowIndex+1;
        if (size<=1){
            return;
        }
        int keyIndex = partition(a,lowIndex,highIndex);
        quickSort(a,lowIndex,keyIndex-1);
        quickSort(a,keyIndex+1,highIndex);
    }
    public static int partition(int[] a, int lowIndex,int highIndex){
        int key = a[lowIndex];
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        while(leftIndex < rightIndex){
            while(leftIndex < rightIndex && a[rightIndex]<=key){
                rightIndex--;
            }
            while(leftIndex < rightIndex && a[leftIndex]>=key){
                leftIndex++;
            }
            swap(a,leftIndex,rightIndex);
        }
        swap(a,leftIndex,lowIndex);
        return leftIndex;
    }
    public  static void swap(int[] a,int index1,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2,};
        System.out.println(findKth(arr, 5, 3));
    }
}
