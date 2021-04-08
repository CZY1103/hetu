import java.util.Scanner;

public class IPAndTen {
    //十进制转八位二进制
    public static String binaryString(String s){
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(s);//字符串转为整数
        int k = 1 << 7;
        for(int i = 0 ;i < 8 ;i++){
            int flag = (num&k)==0?0:1;
            sb.append(flag);
            num = num <<1;
        }
        return sb.toString();
    }
    //IP地址转10进制字符串
    public static long convertIP10(String ip){
        String[] ips = ip.split("\\.");
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < ips.length;i++){
            sb.append(binaryString(ips[i]));//十进制转二进制字符串
        }
        return Long.parseLong(sb.toString(),2);//把二进制的字符串转为十进制
    }
    //10进制字符串转IP地址
    public static String convertIP(String ip10){
        StringBuffer sb = new StringBuffer();
        String ip2 = Long.toBinaryString(Long.parseLong(ip10));
        String as = "";
        if(ip2.length()<32){
            for(int i = 0;i<32-ip2.length();i++){
                as+="0";
            }
        }
        ip2=as+ip2;
        String[] ips = new String[4];
        ips[0] = ip2.substring(0,8);
        ips[1] = ip2.substring(8,16);
        ips[2] = ip2.substring(16,24);
        ips[3] = ip2.substring(24);
        for(int i = 0;i < 4;i++){
            sb.append(Integer.parseInt(ips[i],2));
            if(i!=3){
                sb.append(".");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String ip = sc.nextLine();
            String ten = sc.nextLine();
            System.out.println(convertIP10(ip));
            System.out.println(convertIP(ten));
        }
    }
}
