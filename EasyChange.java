import java.util.Scanner;

public class EasyChange {
    public static int Numberofoperations(long n) {
        int s = 0;
        while (n != 0) {
            if (n == -1) {
                s = -1;
                break;
            }
            if (n % 2 == 1) {
                n = n - 3;
                s++;
            } else {
                n = n / 2;
                s++;
            }
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(Numberofoperations(n));
    }
}
