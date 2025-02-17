public class sumOfArray {

    public static void main(String[] args) {
        int[] intArr = {2, 5, 7, 10};
        int sum=0;
        for(int a: intArr){
            sum+=a;
        }
        System.out.println("The sum of the array is "+sum);
    }
}
