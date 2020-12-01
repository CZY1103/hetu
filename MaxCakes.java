import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.W;

public class MaxCakes {
    public int maxCake(int H,int W){
            int[][] grid = new int[H][W];
            int i = 0;
            int j = 0;
            int count = 0;
            for(i=0;i<H-1;i++){
                for(j=0;j<W-1;j++){
                    for(int m=0;m<H-1;m++){
                        for(int n = 0;n<W-1;n++){
                            if((double)Math.sqrt((m-i)*(m-i)+(n-j)*(n-j))!=2.0){
                                count++;
                            }
                        }
                    }
                }
            }
            return count;
        }
}
