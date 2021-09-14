public class LongestRepeatingSubstring {
    public int solve (String a) {
        int n = a.length();
        int res = 0;
        for(int i = n/2; i > 0;i--){//枚举长度
            for(int j = 0; j < n-i;j++){//枚举起点
                if(a.charAt(j)==a.charAt(i+j)){
                    res++;
                }else{
                    res = 0;//不满足条件，重置长度，从下一个字符为起点开始分析
                }
            }
            if(res==i){
                return i*2;
            }
        }
        return 0;
    }
}
