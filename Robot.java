public class Robot {
    public static int countWays(int x, int y) {
        if(x==1||y==1){
            return 1;
        }
        return countWays(x,y-1)+countWays(x-1,y);
    }

    public static void main(String[] args) {
        System.out.println(countWays(2, 3));
    }
}
