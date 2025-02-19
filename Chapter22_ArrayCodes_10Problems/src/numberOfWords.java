public class numberOfWords {
    public static void main(String[] args) {
        String str = "Hello World!, Java is Fun";
        String[] strArr = str.split(" ");
        int length = strArr.length;
        System.out.println("The number of words are "+length);
    }
}
