public class VerifyingIPAddress {
    public String solve (String IP) {
        if(IPv4(IP)){
            return "IPv4";
        }else if(IPv6(IP)){
            return "IPv6";
        }else{
            return "Neither";
        }
    }
    public static boolean IPv4(String IP){
        //使用limit=-1的split函数，使字符串末尾或开头有一个'.'也能分割出空的字符串
        String[] res = IP.split("\\.",-1);
        if(res.length!=4){
            return false;
        }
        for(String str : res ){
            if(str.length()>1&&str.startsWith("0")){
                return false;
            }
            try{
                int val = Integer.parseInt(str);
                if(!(val >=0&&val<=255)){
                    return false;
                }
            }catch(NumberFormatException numberFormatException){
                return false;
            }
        }
        return true;
    }
    public static boolean IPv6(String IP){
        String[] strs = IP.split(":",-1);
        if(strs.length!=8){
            return false;
        }
        for(String s : strs){
            if(s.length()>4||s.length()==0){
                return false;
            }
            try{
                int val = Integer.parseInt(s,16);
            }catch(NumberFormatException numberFormatException){
                return false;
            }
        }
        return true;
    }
}
