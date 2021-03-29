import java.util.Scanner;

public class ConstituteMinNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0;i < 10;i++){
            array[i]=sc.nextInt();
        }
        for(int i =1 ;i < 10;i++){
            if(array[i]!=0){
                System.out.print(i);
                array[i]--;
                break;
            }
        }
        while(array[0]!=0){
            System.out.print(0);
            array[0]--;
        }
        for(int i = 1;i <10;i++){
            if(array[i]!=0){
                while(array[i]!=0){
                    System.out.print(i);
                    array[i]--;
                }
            }
        }
        System.out.println();
    }
}
