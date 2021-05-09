public class ChildMaxArraySum {
    public static int maxsumofSubarray (int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int sum = arr[0];
        int mamnumber = sum;
        for(int i = 1;i < arr.length;i++){
            sum = sum > 0?sum+arr[i]:arr[i];
            mamnumber = Math.max(sum,mamnumber);
        }
        return mamnumber;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxsumofSubarray(arr));
    }
}
