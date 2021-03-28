public class GrayCode {
    public String[] getGray(int n) {
        String[] s = null;
        if(n==1){
            s = new String[]{"0","1"};
        }else{
            String[] str = getGray(n-1);
            s = new String[2*str.length];
            for(int i = 0;i<s.length/2;i++){
                s[i]="0"+str[i];
                s[s.length-1-i]="1"+str[i];
            }
        }
        return s;
    }
}
