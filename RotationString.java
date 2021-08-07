public class RotationString {
    public boolean solve (String A, String B) {
        char a = A.charAt(0);
        int i =0;
        for( i = 0;i < B.length();i++){
            if(B.charAt(i)==a){
                break;
            }
        }
        String x = B.substring(0,i);
        String y = B.substring(i,B.length());
        StringBuffer sb = new StringBuffer(y);
        sb.append(x);
        if(sb.toString().equals(A)){
            return true;
        }
        return false;
    }
}
