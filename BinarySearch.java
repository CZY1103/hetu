public class BinarySearch {
    public int search (int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        while(left<=right){
            if(nums[mid]==target){
                while(nums[mid]==target){
                    if(mid==0){
                        return mid;
                    }
                    mid--;
                }
                return mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }
}
