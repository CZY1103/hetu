public class ChildArraySort {
    public static int findUnsortedSubarray(int[] nums) {
        int a = 0;
        int b = nums.length-1;
        for(int i = 0;i < nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    a = Math.max(j,a);
                    b = Math.min(i,b);
                }
            }
        }
        return a-1<0?0:a-b+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(findUnsortedSubarray(nums));
    }
}
