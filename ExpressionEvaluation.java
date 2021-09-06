import java.util.*;
public class ExpressionEvaluation {
    public static int solve (String s) {
        //去掉所有空格
        s = s.replaceAll(" ","");
        char[] cs = s.toCharArray();
        int n = s.length();
        int number = 0;
        char sign = '+';
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0;i < n;i++){
            char c = cs[i];
            if(Character.isDigit(c)){//判断字符是否为数字
                number = number*10+c-'0';
            }
            if(c=='('){
                int j = i+1;
                int counterParatition = 1;
                while(counterParatition > 0){
                    if(cs[j]=='('){
                        counterParatition++;
                    }
                    if(cs[j]==')'){
                        counterParatition--;
                    }
                    j++;
                }
                number = solve(s.substring(i+1,j-1));
                i = j - 1;
            }
            if(!Character.isDigit(c)||i==n-1){
                if(sign=='+'){
                    stack.push(number);
                }else if(sign == '-'){
                    stack.push(-1*number);
                }else if(sign == '*'){
                    stack.push(stack.pop()*number);
                }
                number = 0;
                sign = c;
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "(2*(3-4))*5";
        System.out.println(solve(s));
    }
}
