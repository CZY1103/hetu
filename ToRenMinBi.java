import java.util.Scanner;

public class ToRenMinBi {
    static String[] map = {"壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

    public static String resovleqian(double temp) {
        StringBuffer sb = new StringBuffer();
        int qian = (int) temp / 1000;
        if (qian != 0) {
            sb.append(map[qian - 1]).append("仟");
            temp = temp - qian * 1000;
        }
        int bai = (int) temp / 100;
        if (bai != 0) {
            sb.append(map[bai - 1]).append("佰");
            temp = temp - 100 * bai;
        }
        if (qian != 0 && bai == 0) {
            sb.append("零");
        }
        int shi = (int) (temp / 10);
        if (shi != 0) {
            if (shi != 1) {
                sb.append(map[shi - 1]).append("拾");
            }else {
                sb.append("拾");
            }
            temp = temp - shi * 10;
        }
        if (bai != 0 && shi == 0) {
            sb.append("零");
        }
        int ge = (int) temp % 10;
        if (ge != 0) {
            if (qian == 0 && bai == 0 && shi == 0) {
                sb.append("零");
            }
            sb.append(map[ge - 1]);
        }
        String m = sb.toString();
        return m;
    }

    public static String Point(String str) {
        String s = "";
        if (str.equals(00) || str.equals(0)) {
            s = "整";
        } else {
            if (s.charAt(0) != 0) {
                s += map[Integer.valueOf(s.charAt(0)) - 1] + "角";
            }
            if (s.length() > 1 && s.charAt(1) != 0) {
                s += map[Integer.valueOf(s.charAt(1)) - 1] + "分";
            }
        }
        return s;
    }

    public static void resovle(String s) {
        String[] sArry = s.split("\\.");
        int number = Integer.valueOf(s.split("\\.")[0]);
        StringBuffer res = new StringBuffer("人民币");
        int yi = (int) number / 100000000;
        if (yi != 0) {
            res.append(resovleqian(yi)).append("亿");
            number = number - yi * 100000000;
        }
        int wan = (int) number / 10000;
        if (wan != 0) {
            res.append(resovleqian(wan)).append("万");
            number = number - wan * 10000;
        }
        String ge = resovleqian(number);
        if (ge.length() > 1) {
            res.append(ge).append("元");
        }
        if (sArry.length > 1) {
            String point = Point(sArry[1]);
            res.append(point);
        }
        String resString = res.toString();
        if (resString.length() > 4 && resString.charAt(3) == '零' && resString.charAt(4) != '元') {
            resString = resString.substring(0, 3) + resString.substring(4);
        }
        System.out.println(resString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String number = sc.next();
            resovle(number);
        }
        sc.close();
    }
}
