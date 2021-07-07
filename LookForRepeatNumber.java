import java.util.HashSet;

public class LookForRepeatNumber {
    public static int search (int n, int[] a) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int i = 0;i <=n ;i++){
            if(!hashset.add(a[i])){
                return a[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1,3,4,6,1};
        System.out.println(search(4,a));
    }
}
