public class MagicNumber {
    public String change (String number) {
        char[] ch = number.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){
            while(i<j&&ch[i]%2!=0){
                i++;
            }
            while(i<j&&ch[j]%2!=0){
                j--;
            }
            char m = ch[i];
            ch[i] = ch[j];
            ch[j] = m;
            i++;
            j--;
        }
        StringBuffer sb = new StringBuffer();
        for(int k = 0;k < ch.length;k++){
            sb.append(ch[k]);
        }
        return sb.toString();
    }
}
