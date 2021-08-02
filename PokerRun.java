import java.util.Set;
import java.util.TreeSet;

public class PokerRun {
    public boolean IsContinuous(int [] numbers) {
        if(numbers.length<5||numbers.length>5){
            return false;
        }
        int num = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i < 5;i++){
            if(numbers[i]==0){
                num++;
            }else{
                set.add(numbers[i]);
            }
        }
        if(set.size()+num!=5){
            return false;
        }
        if(set.last()-set.first()<5){
            return true;
        }
        return false;
    }
}