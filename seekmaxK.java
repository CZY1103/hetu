public class seekmaxK {
    import java.util.*;

    public class Finder {
        public int findKth(int[] a, int n, int K) {
            int m=removerepeat(a);
            int n = m.length-1;
            while(K>0){
                n--;
                K--;
            }
            return a[n];
        }
        public int[] removerepeat(int[] a){
            int i = 0;
            for(i=0;i<a.length-1;i++){
                if(a[i]==a[i+1]){
                    for(int j = i;j <a.length-1;j++)
                        a[j]=a[j+1];
                    a.length--;
                }
            }
            return a[0];
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
