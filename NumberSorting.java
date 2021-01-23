import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        int a1=0,a2=0,a3=0,a4=0,a5=0;
        int a=1;
        int b=0;
        Scanner sc=new Scanner(System.in);
        int[] printer=new int[5];
        for (int i=0;i<printer.length;i++) {
            printer[i]= sc.nextInt();
        }
        for(int i=0;i<printer.length;i++){
            if(printer[i]%5==0&&printer[i]%2==0){
                a1=a1+printer[i];
            }
            if(printer[i]%5==1){
                a2=a2+a*printer[i];
                a=a*(-1);
            }
            if(printer[i]%5==2){
                a3++;
            }
            if(printer[i]%5==3){
                b++;
                a4=a4+printer[i];
            }
            if(printer[i]%5==4){
                if(a5<printer[i]){
                    a5=printer[i];
                }
            }
        }
        System.out.println(a1+' '+a2+' '+a3+' '+(double)a4/b+' '+a5);
    }
}
