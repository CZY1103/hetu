import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int personnums = sc.nextInt();
            int sort = sc.nextInt();
            List<Student> list = new ArrayList<>();
            for (int i = 0; i <personnums;i++){
                list.add(new Student(sc.next(),sc.nextInt()));
            }
            if (sort==0){
                list.sort(((o1, o2) -> o1.score-o2.score));
            }
            if (sort==1){
                list.sort((((o1, o2) -> o2.score-o1.score)));
            }
            for (Student s : list){
                System.out.println(s.name+" "+s.score);
            }
        }
    }
}
class Student{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }
}
