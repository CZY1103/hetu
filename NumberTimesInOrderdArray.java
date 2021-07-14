public class NumberTimesInOrderdArray {
    public int GetNumberOfK(int [] array , int k) {
        if(array.length==0 || array[0]>k || array[array.length-1]<k){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int mid = (left+right)/2;
        while(left<right){
            if(array[mid]==k){
                break;
            }else if(array[mid]>k){
                right = mid-1;
            }else{
                left =mid+1;
            }
            mid = (left+right)/2;
        }
        if(array[mid]!=k){
            return 0;
        }
        int s = 1;
        for(int i = mid-1;i>=0;i--){
            if(array[i]!=k){
                break;
            }
            s++;
        }
        for(int i = mid +1;i<array.length;i++){
            if(array[i]!=k){
                break;
            }
            s++;
        }
        return s;
    }
}
