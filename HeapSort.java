import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class HeapSort {
    public static int[] myHeapSort(int[] arr){
        //建大堆
        heap(arr,arr.length);
        //进行选择，建堆之后，最大的数在0下标，交换0下标和无需区间最后一个下标的数
        for(int i = 0;i < arr.length-1;i++){
            int temp = arr[0];
            arr[0] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
            //交换之后进行向下调整
            adjustDown(arr,arr.length-i-1,0);
        }
        return arr;
    }

    private static void heap(int[] arr,int size) {
        //从第一个不是叶子结点的结点开始
        for (int i = (size-2)/2;i>=0;i--){
            adjustDown(arr,size,i);
        }
    }

    /**
     * 向下调整
     * @param arr 数组
     * @param size 需要调整的数组长度
     * @param index 调整的下标
     */
    private static void adjustDown(int[] arr, int size, int index) {
        //有左孩子，即不是叶子结点
        while (2*index+1<size){
            int maxIndex = 2*index+1;
            //如果右孩子存在且右孩子大于左孩子，则最大孩子为右孩子，否则为左孩子
            if (maxIndex+1<size && arr[maxIndex]<arr[maxIndex+1]){
                maxIndex++;
            }
            // 如果最大孩子小于父亲，则停止循环
            if (arr[maxIndex]<=arr[index]){
                break;
            }
            //否则，交换最大孩子和父亲
            int temp = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] =temp;

            //继续向下一层调整
            index = maxIndex;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4};
        System.out.println(Arrays.toString(myHeapSort(arr)));
    }
}
