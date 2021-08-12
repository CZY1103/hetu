public class QuickSort {
    /**
     * 快速排序
     */
    public static int[] myQuickSort(int[] arr){
        quickSortProcess(arr,0,arr.length-1);
        return arr;
    }

    /**
     * 快速排序的过程
     * @param arr
     * @param lowIndex
     * @param highIndex
     */
    public static void quickSortProcess(int[] arr,int lowIndex,int highIndex){
        //区间长度 区间是左闭右闭的
        int size = highIndex-lowIndex+1;
        if (size<=1){
            return;
        }
        //找到中间下标
        int keyIndex = partition(arr,lowIndex,highIndex);
        //对左边区间进行快速排序
        quickSortProcess(arr,lowIndex,keyIndex-1);
        //对右边区间进行快速排序
        quickSortProcess(arr,keyIndex+1,highIndex);
    }

    /**
     * 进行分组
     * @param arr
     * @param lowIndex 起始下标
     * @param highIndex 终止下标
     * @return 找到的关键值的下标
     */
    private static int partition(int[] arr, int lowIndex, int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        //找一个分解值
        int key = arr[lowIndex];
        //进行区分
        while (leftIndex<rightIndex){
            //找到右边小于关键值的下标
            while (leftIndex<rightIndex && arr[rightIndex]>=key){
                rightIndex--;
            }
            //左边大于关键值的下标
            while (leftIndex<rightIndex && arr[leftIndex]<=key){
                leftIndex++;
            }
            //交换
            swap(arr,leftIndex,rightIndex);
        }
        //交换关键值，即key和leftIndex(此时leftIndex和righIndex重合)
        swap(arr,leftIndex,lowIndex);
        return leftIndex;
    }

    /**
     * 交换
     * @param arr
     * @param index1
     * @param index2
     */
        public static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,9,8,6,3,4};
        myQuickSort(arr);
        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
