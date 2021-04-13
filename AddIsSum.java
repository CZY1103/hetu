import java.util.Scanner;

public class AddIsSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0;i<n;i++){
            A[i]=sc.nextInt();
        }
        long[] dp = new long[sum+1];
        dp[0]=1;
        for(int i = 0;i < n;i++){
            for(int j = sum;j >= 0;j--){
                if(j>=A[i]){
                    dp[j]+=dp[j-A[i]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
