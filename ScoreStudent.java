import java.util.Scanner;

public class ScoreStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] score = new int[n];
            for(int i =0 ;i <n ;i++){
                score[i] = sc.nextInt();
            }
            int sco = sc.nextInt();
            int nums = 0;
            for(int i =0 ;i <n ;i++){
                if(score[i]==sco){
                    nums++;
                }
            }
            System.out.println(nums);
        }
    }
}
