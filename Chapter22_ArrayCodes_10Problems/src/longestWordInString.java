public class longestWordInString {
    public static void main(String[] args) {
        String str="We are learning Automation using Selenium and Java";
        String longestWord="";
        String[] strArr = str.split(" ");
        for(String word: strArr){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("The longest Word is "+longestWord+" with length "+ longestWord.length());
    }
}
