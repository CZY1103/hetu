import java.util.*;
public class ExpressionEvaluation {
    public static Map<Character,Integer> map = new HashMap<Character,Integer>(){{
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
    }};
    public static int solve (String s) {
        //去掉所有空格
        s = s.replaceAll(" ","");
        char[] cs = s.toCharArray();
        int n = s.length();
        //存放数字
        Deque<Integer> nums = new ArrayDeque<>();
        nums.addLast(0);
        //存放所有非数字以外的
        Deque<Character> ops = new ArrayDeque<>();
        for(int i = 0;i < n;i++){
            char c = cs[i];
            if(c=='('){
                ops.addLast(c);
            }else if(c==')'){
                //计算到最近的一个左括号为止
                while(!ops.isEmpty()){
                    if(ops.peekLast()!='('){
                        calc(nums,ops);
                    }else{
                        ops.pollLast();
                        break;
                    }
                }
            }else{
                if(isNumber(c)){
                    int u = 0;
                    int j = i;
                    //将从i位置开始后面的连续数字整体取出，加入nums
                    while(j<n && isNumber(cs[j])){
                        u = u*10+(cs[j++] - '0');
                    }
                    nums.addLast(u);
                    i = j-1;
                }else{
                    if(i > 0 && (cs[i-1]=='('||cs[i-1]=='+'||cs[i-1]=='-')){
                        nums.addLast(0);
                    }
                    //有一个新操作要入栈时，先把栈内可以算的算了
                    //只有满足[栈内运算符]比[当前运算符]优先级高/同等，才进行运算
                    while(!ops.isEmpty()&&ops.peekLast()!='('){
                        char pre =ops.peekLast();
                        if(map.get(pre) >= map.get(c)){
                            calc(nums,ops);
                        }else{
                            break;
                        }
                    }
                    ops.addLast(c);
                }
            }
        }
        while(!ops.isEmpty()&&ops.peekLast()!='('){
            calc(nums,ops);
        }
        return nums.peekLast();
    }
    //判断字符是否为数字
    public static boolean isNumber(char c){
        return Character.isDigit(c);
    }
    //计算逻辑：从nums中取出两个操作数，从ops中取出运算符，
    //然后根据运算符进行计算即可
    public static void calc(Deque<Integer> nums,Deque<Character> ops){
        if(nums.isEmpty()||nums.size()<2){
            return;
        }
        if(ops.isEmpty()){
            return;
        }
        int b = nums.pollLast();
        int a = nums.pollLast();
        char op = ops.pollLast();
        int ans = 0;
        if(op == '+'){
            ans = a + b;
        }else if(op == '-'){
            ans = a-b;
        }else if(op == '*'){
            ans = a*b;
        }
        nums.addLast(ans);
    }

    public static void main(String[] args) {
        String s ="1+2";
        System.out.println(solve(s));
    }
}
