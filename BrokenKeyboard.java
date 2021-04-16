import java.util.ArrayList;
import java.util.Scanner;

public class BrokenKeyboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String longStr = sc.next();
        String shortStr = sc.next();
        ArrayList<Character> miss = new ArrayList<>();
        int i = 0;
        int j = 0;
        int size = longStr.length();
        while(i < size){
            boolean wornOut = false;//假设没有损坏
            char longCh = longStr.charAt(i);
            char longUpper = Character.toUpperCase(longCh);
            if(j >= shortStr.length()){
                wornOut = true;
            }else{
                char shortCh = shortStr.charAt(j);
                char shortUpper = Character.toUpperCase(shortCh);
                if (longUpper!=shortUpper){
                    wornOut = true;
                }
            }
            if (wornOut){
                if (!miss.contains(longUpper)){
                    miss.add(longUpper);
                }
                i++;
            }else{
                i++;
                j++;
            }
        }
        for (int k = 0;k < miss.size();k++){
            System.out.print(miss.get(k));
        }
        System.out.println();
    }
}
