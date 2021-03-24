import java.util.Scanner;

public class DeleteStringCountains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String longs = sc.nextLine();
            String shorts = sc.nextLine();
            char[] c = longs.toCharArray();
            for(int i = 0; i<c.length;i++){
                if(!(shorts.contains(String.valueOf(c[i])))){
                    System.out.print(c[i]);
                }
            }
        }
    }
}
