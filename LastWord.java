public class LastWord {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int end = s.length()-1;
        while(end>=0 && s.charAt(end)==' ');
        int start = end;
        while(start>= 0 &&s.charAt(start)!=' '){
            start--;
        }
        return end - start;
    }
}
