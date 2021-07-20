package Strings;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args){
        String line  = "I am a java developer";

        String[] words = line.split(" ");
        String[] twoWords = line.split(" ",2);
    
        System.out.println("String Split with delimiter ::" + Arrays.toString(words));
        System.out.println("String Split into two ::" + Arrays.toString(twoWords));

        String wordsWithNumbers = "I|am|a|Java|Developer";
        
        String[] numbers = wordsWithNumbers.split("\\|");
        System.out.println(" String Split with special character ::" + Arrays.toString(numbers));
        
    }
    
}
