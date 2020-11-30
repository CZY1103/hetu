
import java.util.*;
public class inserthuiwen {
        public static boolean ishuiwen(String str){
            int i = 0;
            int j = str.length()-1;
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    public static void main(String[] args) {
                Scanner str = new Scanner(System.in);
                String A = str.nextLine();
                String B = str.nextLine();
                int count = 0;
                for(int i = 0;i<=A.length();i++) {
                    StringBuilder st = new StringBuilder(A);
                    st.insert(i,B);
                    if(ishuiwen(st.toString())){
                        count++;
                    }
                }
        System.out.println(count);
        }
    }
