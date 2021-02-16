import java.util.Arrays;

public class ArrayThirdMax {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length<3){
            return nums[nums.length-1];
        }
        int j = nums.length-1;
        int i = 2;
        while(i>0&&j>=0){
            if(i==1&&j==0){
                return nums[j];
            }else if (j!=0&&nums[j]==nums[j-1]){
                j--;
            }else{
                i--;
                j--;
            }
        }
        if (i==0) {
            return nums[j];
        }else{
            return nums[nums.length-1];
        }
    }
    public static int thirdMax1(int[] nums) {
        Arrays.sort(nums);
        if (nums.length<3){
            return nums[nums.length-1];
        }
        int j = nums.length-1;
        int Max1 = nums[j];
        int Max2 = 0;
        int m = 2;
        while(m>=0&&j>0){
            if (j!=0&&nums[j]==nums[j-1]){
                j--;
            }else{
                Max2 = nums[j-1];
                m--;
            }
        }
        if (m==0) {
            return Max2;
        }else{
            return Max1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,5,5};
        System.out.println(thirdMax1(nums));
    }
}
