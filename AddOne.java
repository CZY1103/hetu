public class AddOne {
    public static int[] plusOne(int[] digits) {
        int j = digits.length-1;
        if(digits[j]==9&&j!=0){
            digits[j]=0;
            j--;
            while(digits[j]==9&&j>=0){
                digits[j]=0;
                if(j==0){
                    digits=new int[digits.length+1];
                    digits[0]=1;
                    return digits;
                }
                j--;
            }
            digits[j]=digits[j]+1;
        }else if(digits[j]==9&&j==0){
            digits[j]=0;
            digits=new int[digits.length+1];
            digits[0]=1;
            return digits;
        }else{
            digits[j]=digits[j]+1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] d = plusOne(digits);
        for (int i = 0;i < d.length;i++){
            System.out.print(d[i]+" ");
        }
        System.out.println();
    }
}
