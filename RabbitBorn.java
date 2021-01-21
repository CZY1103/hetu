public class RabbitBorn {
    public static  int gerTotalCount(int monthCount){
        if(monthCount<3){
            return 1;
        }else{
            return gerTotalCount(monthCount-1)+gerTotalCount(monthCount-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(gerTotalCount(9));
    }
}
