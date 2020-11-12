import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses匹配括号 {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);//入栈
                    break;
                default: {
                    if (stack.isEmpty()) {
                        return false;//右括号多了
                    }
                    char left = stack.pop();
                    if (!comparatorlr(left,c)) {
                        return false;//左右不匹配
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;//左括号多了
        }
    }
    private boolean comparatorlr(char left,char right){
        if(left=='('&&right==')'){
            return true;
        }else if(left=='['&&right==']'){
            return true;
        }else if(left=='{'&&right=='}'){
            return true;
        }
        return false;
    }
}
