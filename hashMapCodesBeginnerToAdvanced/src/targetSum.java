import java.util.HashMap;

public class targetSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int targetSum=9;
        map.put(1,3);
        map.put(2,6);
        map.put(3,3);
        map.put(4,8);
        map.put(5,1);
        for(int key: map.keySet()) {
                int remaining=targetSum-map.get(key);
                if(map.containsValue(remaining)){
                    System.out.println("The numbers are "+ map.get(key)+" and "+remaining);
            }
        }
    }
}
