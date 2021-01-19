public class NumsInsert {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]<target){
                j++;
            }
        }
        return j;
    }
}
