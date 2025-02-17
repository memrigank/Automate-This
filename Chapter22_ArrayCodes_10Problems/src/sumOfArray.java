public class sumOfArray {

    public static void main(String[] args) {
        int[] intArr = {3, 6, 5, 8, 2, 7};
        int sum=0;
        for(int a: intArr){
            sum+=a;
        }
        System.out.println(sum);
    }
}
