public class RockPaperScissors {
    public static int Mostvictories (int n, int p1, int q1, int m1, int p2, int q2, int m2) {
        return Math.min(p1,q2)+Math.min(q1,m2)+Math.min(m1,p2);
    }

    public static void main(String[] args) {
        System.out.println(Mostvictories(
                6,2,2,2,2,2,2
        ));
    }
}
