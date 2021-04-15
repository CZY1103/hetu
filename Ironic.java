import java.util.Scanner;

public class Ironic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        for(int i = str1.length-1;i>=0;i--){
            if(i==0){
                System.out.println(str1[i]);
            }else{
                System.out.print(str1[i]+" ");
            }
        }
    }
}
