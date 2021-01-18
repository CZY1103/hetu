public class ArrayCircle {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        while(k>0){
            int a=nums[len-1];
            for(int i=len-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=a;
            k--;
        }
    }

}
