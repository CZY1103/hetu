import java.util.Scanner;

public class ShullfeText {
    public  static  int[] shullfe(int[] array1,int[] array2){
        int[] array = new int[2*array1.length];
        for(int i = array.length-1;i>=0;i--){
            if(i%2==0){
                array[i]=array1[i/2];
            }else{
                array[i]=array2[i/2];
            }
        }
        return array;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while(s >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] array = new int[2*n];
            for(int i = 0;i < 2*n;i++){
                array[i]= sc.nextInt();
            }
            while(k > 0){
                int[] array1 = new int[n];
                int[] array2 = new int[n];
                for(int i = 0;i < n;i++){
                    array1[i]=array[i];
                    array2[i]=array[i+n];
                }
                array = shullfe(array1,array2);
                k--;
            }
            for(int i = 0;i < 2*n;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
            s--;
        }
    }
}
