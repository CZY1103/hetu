import java.util.Stack;

public class AlphabetRollback {
    public static String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();
        for (char c:S.toCharArray()){
            if (Character.isLetter(c)){
                letters.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c:S.toCharArray()){
            if (Character.isLetter(c)){
                sb.append(letters.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String S ="ab-cd";
        System.out.println(reverseOnlyLetters(S));
    }
}
