import java.util.LinkedList;

public class JosephProblem {
    public int ysf (int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        if(m < 1|| n < 1){
            return -1;
        }
        for(int i = 0 ;i < n;i++){
            list.add(i);
        }
        int res = 0;
        while(list.size()>1){
            res = (res+m-1)%list.size();
            list.remove(res);
        }
        return list.get(0)+1;
    }
//    public int ysf (int n, int m) {
//        if(m<1||n<1){
//            return -1;
//        }
//        int last = 0;
//        for(int i = 2;i <= n;i++){
//            last = (last+m)%i;
//        }
//        return last+1;
//    }
}
