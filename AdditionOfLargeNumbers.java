import java.util.Stack;

public class AdditionOfLargeNumbers {
    public static String solve (String s, String t) {
        Stack<Integer> stack = new Stack<>();
        int i = s.length()-1;
        int j = t.length()-1;
        int carry = 0;
        while(i>=0||j>=0||carry!=0){
            carry += i >=0 ? s.charAt(i--)-'0':0;
            carry += j >=0 ? t.charAt(j--)-'0':0;
            stack.push(carry%10);
            carry = carry/10;
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "1";
        String t = "99";
        System.out.println(solve(s, t));
    }
}
