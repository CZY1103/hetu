import java.util.Scanner;

public class ApartSweets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int F =sc.nextInt();
        int G =sc.nextInt();
        int H =sc.nextInt();
        if((E+G)%2==0&&(F+H)%2==0&&(E+G)>=0&&(F+H)>=0){
            System.out.print((E+G)/2+" ");
            System.out.print((F+H)/2+" ");
            System.out.print(H-(F+H)/2);
            System.out.println();
        }else{
            System.out.println("No");
        }
    }
}
