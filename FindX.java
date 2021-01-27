import java.util.Scanner;

public class FindX {
    public static int index(int[] m,int x){
        int i = 0;
        for(i=0;i<m.length;i++){
            if(m[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for(int i = 0;i<n;i++){
            m[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(index(m,x));
    }
}
