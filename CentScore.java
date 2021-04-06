import java.util.Scanner;
public class CentScore{
    public static double ScoreTo(int score){
        if(score>=90&&score<=100){
            return 4.0;
        }
        if(score>=85&&score<=89){
            return 3.7;
        }
        if(score>=82&&score<=84){
            return 3.3;
        }
        if(score>=78&&score<=81){
            return 3.0;
        }
        if(score>=75&&score<=77){
            return 2.7;
        }
        if(score>=72&&score<=74){
            return 2.3;
        }
        if(score>=68&&score<=71){
            return 2.0;
        }
        if(score>=64&&score<=67){
            return 1.5;
        }
        if(score>=60&&score<=63){
            return 1.0;
        }else{
            return 0.0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cent = new int[n];
        for(int i= 0;i<n ;i++){
            cent[i]=sc.nextInt();
        }
        int[] score = new int[n];
        for(int i= 0;i<n ;i++){
            score[i]=sc.nextInt();
        }
        double centSum = 0.0;
        for(int i= 0;i<n ;i++){
            centSum=centSum+cent[i];
        }
        double scoreSum = 0.0;
        for(int i= 0;i<n ;i++){
            scoreSum=scoreSum+ScoreTo(score[i])*cent[i];
        }
        System.out.printf("%.2f",(float)scoreSum/centSum);
    }
}
