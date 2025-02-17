public class secondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56, 78, 90};
       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
       for (int num: numbers){
           if(num>largest){
               secondLargest=largest;
               largest=num;
           } else if(num<largest){
               secondLargest=num;
           }
       }
        System.out.println("The second largest number is: "+secondLargest);
    }
}