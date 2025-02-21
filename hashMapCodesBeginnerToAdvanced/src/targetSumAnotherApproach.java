import java.util.HashMap;

public class targetSumAnotherApproach {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int targetSum=9;
        map.put(1,3);
        map.put(2,6);
        map.put(3,3);
        map.put(4,8);
        map.put(5,1);
        int limit=map.size();
        for(int i=1;i<=limit;i++){
            for(int j=i+1;j<=limit;j++){
                if((map.get(i)+map.get(j))==targetSum){
                    System.out.println("the numbers are "+map.get(i)+" and "+ map.get(j));
                }
            }
        }
    }
}

