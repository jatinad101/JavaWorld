package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        System.out.print("Enter the string to reverse ::");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        reverseInputString(input);
        sc.close();
    }
    
    private static void reverseInputString(String input){
        StringBuilder str = new StringBuilder(input);
        String output = str.reverse().toString();
        System.out.print(output);
    }
}
