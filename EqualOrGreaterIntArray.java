import java.util.Scanner;

public class EqualOrGreaterIntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] str = s.split(" ");
            int[] number = new int[100];
            for(int i = 0;i <str.length;i++){
                    number[Integer.valueOf(str[i])]++;
            }
            for(int i = 0;i <number.length;i++){
                if(number[i]>=str.length/2){
                    System.out.println(i);
                }
            }
        }
    }
}
