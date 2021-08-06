import java.util.Arrays;

public class LargestProductThreeNumbers {
    public static long solve (int[] A) {
        Arrays.sort(A);
        int m = A.length-1;
        long max1 =(long) A[m]*A[m-1]*A[m-2];
        long max2 =(long) A[0]*A[1]*A[m];
        return Math.max(max1,max2);
    }

    public static void main(String[] args) {
        int[] A = {-977855,899752,-323313,-199058,-891254,-563169,-240502,516061,
                867949,879891,-34574,347840,-277817,-628081,253691,-609568,-130489,
                -450337,797317,-15134};
        System.out.println(solve(A));
    }
}
