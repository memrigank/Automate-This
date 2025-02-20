import java.util.HashMap;

public class firstUniqueWord {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "Armageddon";
        String nS = s.toLowerCase();
        char[] c= nS.toCharArray();
        int i=0;
        int uniqueChar = 0;
        for(char a: c){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(i=0;i<nS.length();i++){
            if(map.get(nS.charAt(i))==1){
                uniqueChar=i;
                break;
            }
        }
        System.out.println(uniqueChar+ " index is the first unique char, and the character is "+s.charAt(uniqueChar));

    }
}
