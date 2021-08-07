import java.util.Scanner;

public class NiuQueue {
    public static int door(int n,int[] arr){
        int time = 0;
        while(true){
            for(int i = 0;i < n;i++){
                if(arr[i]-time<=0){
                    return i+1;
                }else{
                    time++;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(",|\\[|\\]");
        int n = Integer.parseInt(str[0]);
        int[] arr = new int[n];
        for(int i =2;i<str.length;i++){
            arr[i-2]=Integer.parseInt(str[i]);
        }
        System.out.println(door(n,arr));
    }
}
