public class MiddleIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        int left = 0;
        int right = 0;
        for (int i = 0;i<nums.length;i++){
            if (i ==0){
                left=0;
            }else{
                left=left+nums[i-1];
            }
            right=sum-left-nums[i];
            if (left==right){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }
}
