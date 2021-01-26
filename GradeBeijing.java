import java.util.Scanner;

public class GradeBeijing {
    public static double point(int grade){
        double point = 0;
        if(grade>=90&&grade<=100){
            point = 4.0;
        }else if(grade>=85&&grade<=89){
            point = 3.7;
        }else if(grade>=82&&grade<=84){
            point = 3.3;
        }else if(grade>=78&&grade<=81){
            point = 3.0;
        }else if(grade>=75&&grade<=77){
            point = 2.7;
        }else if(grade>=72&&grade<=74){
            point = 2.3;
        }else if(grade>=68&&grade<=71){
            point = 2.0;
        }else if(grade>=64&&grade<=67){
            point = 1.5;
        }else if(grade>=60&&grade<=63){
            point = 1.0;
        }else if(grade<60){
            point = 0;
        }
        return point;
    }
    public static double creditPoint(int grade,int credit){
        double c = point(grade)*credit;
        return c;
    }
    public static double allPoint(int[] grade,int[] credit){
        double allCredit = 0;
        double C = 0;
        int allP = 0;
        for(int i =0;i<grade.length;i++){
            C= creditPoint(grade[i],credit[i]);
            allCredit = allCredit+C;
        }
        for(int i=0;i<credit.length;i++){
            allP = allP+credit[i];
        }
        return allCredit/allP;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] credit = new int[n];
        int[] grade = new int[n];
        for(int i = 0;i<n;i++){
            credit[i]=in.nextInt();
        }
        for(int i = 0;i<n;i++){
            grade[i]=in.nextInt();
        }
        System.out.printf("%.2f",allPoint(grade,credit));
    }
}
