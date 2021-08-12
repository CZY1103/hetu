public class BubbleSort {
    /**
     * 冒泡排序
     */
    public static int[] myBubbleSort(int[] arr){
        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0;j < arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        return arr;
    }

    /**
     * 优化后的冒泡排序：如果这一轮没有发生交换，则已经排序好，不需要进行下一轮
     */
    public static int[] myOptimizeBubbleSort(int[] arr){
        boolean flag;
        for (int i = 0;i < arr.length-1;i++){
            flag = false;
            for (int j = 0;j < arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag==false){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,1};
        myBubbleSort(arr);
        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr1 = {8,9,5,6,7};
        myOptimizeBubbleSort(arr1);
        for (int i = 0 ;i < arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
