
public class StringChange {
    public static String toLowerCase(String str){
        int len=str.length();
        char[] ch=str.toCharArray();
        char[] ch2 = new char[len];
        for(int i=0;i<len;i++){
            if(ch[i]<'Z'&&ch[i]>'A'){
                ch2[i]= (char) (ch[i]+32);
            }else{
                ch2[i]=ch[i];
            }
        }
        String str2= ch2.toString();
        return str2;
    }

    public static void main(String[] args) {
        String str="Ab";
        System.out.println(toLowerCase(str));
    }
}
