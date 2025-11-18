import java.util.Arrays;

//Check Two Strings are anagrams of each other or not
//Anagrams->Two strings have same characters but different order 
public class anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        // Convert strings into lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Check length of string are same or not
        if (str1.length() == str2.length()) {
            // Convert the string into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // Sort the character array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // Check both the sorted array is Equal or not
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " " + "and" + " " + str2 + " are Anagrams of each other");
            } else {
                System.out.println(str1 + " " + "and" + " " + str2 + "are not a Anagrams");
            }
            // If length is not equal then this condition will be print
        } else {
            System.out.println(str1 + "and" + str2 + "are not a Anagrams");
        }

    }
}
