import java.util.HashMap;

public class FirstCharacterOnce {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> hashmap = new HashMap<>();
        char[] ch = str.toCharArray();
        for(int i = 0;i < str.length();i++){
            if(hashmap.containsKey(ch[i])){
                Integer count = hashmap.get(ch[i]);
                hashmap.put(ch[i],count+1);
            }else{
                hashmap.put(ch[i],1);
            }
        }
        for(int i = 0;i < str.length();i++){
            if(hashmap.get(ch[i])==1){
                return i;
            }
        }
        return -1;
    }
}
