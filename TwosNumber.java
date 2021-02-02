public class TwosNumber {
    public int countNumberOf2s(int n) {
        int s = 0;
        int y = 0;
        for(y = 0;y<=n;y++){
            String m = Integer.toString(y);
            for(char q:m.toCharArray()){
                if(q=='2'){
                    s++;
                }
            }
        }
        return s;
    }
}
