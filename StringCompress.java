public class StringCompress {
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int s = 1;
        for (int i = 0;i < chars.length;i++){
            if(i!=chars.length-1&&chars[i]==chars[i+1]){
                s++;
            }else{
                sb.append(chars[i]);
                if (s != 1) {
                    sb.append(s);
                }
                s=1;
            }
        }
        char[] c = sb.toString().toCharArray();
        return c.length;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c'};
        System.out.println(compress(chars));
    }
}
