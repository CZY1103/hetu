import java.util.Scanner;

public class Text1 {
        public static void text(int[] arr){
            int L = 0;
            int R = 0;
            for(int i = 0;i<arr.length;i++){
                for(int j = i;j>=0;j--){
                    if(arr[j]<arr[i]){
                        L=j;
                        break;
                    }else{
                        L=-1;
                    }
                }
                for(int j = i;j<arr.length;j++){
                    if(arr[j]<arr[i]){
                        R=j;
                        break;
                    }else{
                        R=-1;
                    }
                }
                System.out.println(L+" "+R);
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            text(arr);
        }
    }
