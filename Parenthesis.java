import java.util.Stack;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> lefts = new Stack<Character>();
        if(A.isEmpty()||n%2!=0){
            return false;
        }
        char[] c = A.toCharArray();
        for(int i = 0;i < c.length;i++){
            if(c[i]=='('){
                lefts.push(c[i]);
            }else{
                if(lefts.isEmpty()){
                    return false;
                }else {
                    lefts.pop();
                }
            }
        }
        if(!(lefts.isEmpty())){
            return false;
        }
        return true;
    }
}
