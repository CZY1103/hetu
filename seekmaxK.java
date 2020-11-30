import java.util.*;

public class seekmaxK {

    public class Finder {
        public int findKth(int[] a, int n, int k) {
            return removerepeat(a,0,n-1,k);
        }
        public int removerepeat(int[] a,int lowIndex,int highIndex,int k) {
            int park = partion(a, lowIndex, highIndex);
            if (k == park-lowIndex+1) {
                return a[k];
            } else if (k>park-lowIndex+1) {
                return removerepeat(a, park + 1, highIndex, k - park + lowIndex - 1)
            } else {
                return removerepeat(a, lowIndex, park - 1, k)
            }
        }
        public void swap(int[] a,int Index1,int Index2){
            int temp=a[Index1];
            a[Index1]=a[Index2];
            a[Index2]=temp;
        }
        public  int partion(int[] a,int lowIndex,int highIndex){
            int leftIndex=lowIndex;
            int rightIndex=highIndex;
            int middle=a[lowIndex];
            while(leftIndex<rightIndex){
                while(leftIndex<rightIndex && a[rightIndex]>=middle){
                    rightIndex--;
                }
                while(leftIndex<rightIndex && a[leftIndex]<=middle){
                    leftIndex++;
                }
                swap(a,leftIndex,rightIndex);
            }
            swap(a,leftIndex,lowIndex);
            return leftIndex;
        }
    }
}
