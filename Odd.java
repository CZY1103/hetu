import java.util.Scanner;

public class Odd {
    public static void jijiaoyan(char[] s){
        int[] result = new int[8];
        for(int i = 0;i < s.length;i++){
            int n = 0X01;
            int j = 7;
            int sum = 0;
            while(j>0){
                result[j]=(s[i]&n) ==0?0:1;
                if(result[j] ==1){
                    sum++;
                }
                n = n<<1;
                j--;
            }
            if(sum%2==0){
                result[0]=1;
            }else{
                result[0]=0;
            }
            for(int k = 0;k <8;k++){
                System.out.print(result[k]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            jijiaoyan(s.toCharArray());
        }
    }
}
