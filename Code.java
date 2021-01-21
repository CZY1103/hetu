public class Code {
    public void NowCoder(char[] code){
        int i=0;
        if(code[i]>='A'&&code[i]<='U'){
            code[i]= (char) (code[i]+5);
        }else{
            code[i]= (char) (code[i]-21);
        }
    }
}
