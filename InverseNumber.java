import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder s = new StringBuilder();
        while(num != 0){
            s.append(num%10);
            num = num/10;
        }
        System.out.println(s);
    }
}
