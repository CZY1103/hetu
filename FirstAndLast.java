public class FirstAndLast {
    public static int search(int[] nums,int target){
        int first = 0;
        int last = nums.length-1;
        int j =( last+first)/2;
        int s = (nums.length-1)/2;
        while(s>0) {
            if (nums[j] == target) {
                return j;
            } else if (nums[j] > target) {
                last = j - 1;
            } else if (nums[j] < target) {
                first = j + 1;
            }
            j = ( last+first)/2;
            s =s/2;
        }
        return -1;
    }
    public static int[] searchRange(int[] nums, int target) {
       int j = search(nums, target);
       int start = j;
       int end = j;
       if (j==-1){
           return new int[]{-1,-1};
       }else{
           while(nums[start]==target){
               start--;
           }
           while (nums[end]==target){
               end++;
           }
           return new int[]{start+1,end-1};
       }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] m = searchRange(nums,target);
        for (int i=0;i<2;i++){
            System.out.print(m[i]+' ');
        }
        System.out.println();
    }
}
