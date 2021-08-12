public class MergeSort {
    public static int[] myMergeSort(int[] arr){
        mergeSortPart(arr,0,arr.length);
        return arr;
    }

    /**
     * 分区间
     * @param arr
     * @param lowIndex
     * @param highIndex
     */
    private static void mergeSortPart(int[] arr, int lowIndex, int highIndex) {
        //区间是左闭右开的
        int size = highIndex-lowIndex;
        if (size<=1){
            return;
        }
        //找到中间下表，把整个数组平均分成两个区间
        int midIndex = (highIndex+lowIndex)/2;
        mergeSortPart(arr,lowIndex,midIndex);
        mergeSortPart(arr,midIndex,highIndex);

        //合并两个有序区间
        mergeSortProcess(arr,lowIndex,midIndex,highIndex);
    }

    /**
     * 合并两个有序区间
     * @param arr 数组
     * @param lowIndex 左区间左下标
     * @param midIndex 左区间右下标，右区间左下标
     * @param highIndex 右区间右下标
     */
    private static void mergeSortProcess(int[]arr,int lowIndex,int midIndex,int highIndex){
        int size = highIndex - lowIndex;
        int leftIndex = lowIndex;
        int rightIndex = midIndex;
        int[] extraArray = new int[size];
        int extraIndex = 0;
        //循环，
        while (leftIndex<midIndex && rightIndex< highIndex){
            //左区间的数小于右区间，则把左区间的数放到额外数组中
            if (arr[leftIndex]<=arr[rightIndex]){
                extraArray[extraIndex]=arr[leftIndex];
                leftIndex++;
            }else{
                //右区间的数小于左区间，则把右区间的数放到额外数组中
                extraArray[extraIndex]=arr[rightIndex];
                rightIndex++;
            }
            extraIndex++;
        }
        //当右区间结束，把左区间剩余的数全部依次放进额外数组中
        if (leftIndex<midIndex){
            while (leftIndex<midIndex){
                extraArray[extraIndex++]=arr[leftIndex++];
            }
        }else{
            //当左区间结束，把右区间剩余的数全部依次放进额外数组中
            while (rightIndex<highIndex){
                extraArray[extraIndex++]=arr[rightIndex++];
            }
        }
        //再把排序好的数组搬回到原数组中，完成合并
        for (int i = 0;i < size;i++){
            arr[i+lowIndex]=extraArray[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,9,8,6,3,4};
        myMergeSort(arr);
        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
