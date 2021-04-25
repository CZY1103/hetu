import java.util.Stack;

public class LegalBrackets {
    public static boolean isValid (String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0;i < ch.length;i++){
            if (ch[i]=='(' || ch[i]=='[' || ch[i]=='{'){
                st.push(ch[i]);
            }else if (ch[i]==')'||ch[i]==']' || ch[i]=='}'){
                if (st.empty()){
                    return false;
                }else if(ch[i]==')'&&st.peek()=='('||ch[i]==']'&&st.peek()=='['||
                        ch[i]=='}'&&st.peek()=='{') {
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if (st.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "[()]";
        System.out.println(isValid(s));
    }
}
