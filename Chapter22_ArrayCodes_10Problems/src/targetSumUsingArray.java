public class targetSumUsingArray {

    public static void main(String[] args) {
        int[] intArr = {23, 45, 34, 89, 79, 21, 0};
        int targetSum = 79;
       for(int i=0; i< intArr.length;i++){
          for(int j=i+1;j< intArr.length;j++) {
              if (intArr[i]+intArr[j]==targetSum)
                  System.out.println("The numbers are: " + intArr[i] + " and " + intArr[j]);
           }
       }
    }
}
