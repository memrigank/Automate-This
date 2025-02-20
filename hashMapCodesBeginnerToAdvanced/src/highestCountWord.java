import java.util.HashMap;

public class highestCountWord {

    public static void main(String[] args) {
        String s = "Vikramaditya";
        String ls = s.toLowerCase();
        char[] c = ls.toCharArray();
        int count=0;
        char uniqueChar = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char a: c){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(char a: c){
            if(map.get(a)>count){
                count=map.get(a);
                uniqueChar=a;
            }
        }
        System.out.println("The first char with highest count is: "+count+" and the char is: "+uniqueChar);
    }
}
