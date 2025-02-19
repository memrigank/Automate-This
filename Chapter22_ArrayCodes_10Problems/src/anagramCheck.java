import java.util.Arrays;

public class anagramCheck {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        char[] str1Arr = str1.toLowerCase().toCharArray();
        char[] str2Arr = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        System.out.println(str1Arr);
        System.out.println(str2Arr);

        if(Arrays.equals(str1Arr, str2Arr)){
            System.out.println(str1+ " and "+str2+ " are anagram");
        }
        else
        System.out.println("The strings are not anagrams");
    }
}
