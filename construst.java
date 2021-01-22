public class construst {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] r=ransomNote.toCharArray();
        char[] m=magazine.toCharArray();
        if(r.length>m.length){
            return false;
        }
        int[] e=new int[26];
        int[] f=new int[26];
        for(int i=0;i<r.length;i++){
            e[r[i]-'a']++;
        }
        for(int j=0;j<m.length;j++){
            f[m[j]-'a']++;
        }
        for(int c=0;c<26;c++){
            if(e[c]>f[c]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String r="fihjjjjei";

        String m="hjibagacbhadfaefdjaeaebgi";
        System.out.println(canConstruct(r, m));
    }
}
