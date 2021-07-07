public class MoveApl {
    public static String change (String s) {
        StringBuffer m = new StringBuffer();
        StringBuffer n = new StringBuffer();
        char[] ch = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(ch[i]=='a'){
                m.append('a');
            }else{
                n.append(ch[i]);
            }
        }
        n.append(m);
        return n.toString();
    }

    public static void main(String[] args) {
        String s = "acnasklfj";
        System.out.println(change(s));
    }
}
