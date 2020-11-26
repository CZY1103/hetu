import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;

public class Parenthesis {
    public static  boolean chkParenthesis(java.lang.String A, int n){
        if (n%2==1){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] charArray = A.toCharArray();
        for (char c:charArray){
            if (c=='('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        java.lang.String str ="()()(())";
        System.out.println(chkParenthesis(str,8));
    }
}
