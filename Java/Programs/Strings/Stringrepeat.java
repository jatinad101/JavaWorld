package Strings;

import java.util.Scanner;

public class Stringrepeat {
    
    static char count[] = new char[256];
    

    static void getcharcountArray(String str){
           for(int i=0;i<str.length();i++){
               count[str.charAt(i)]++;
           }
    }
    static int repeatCharcount(String str){

        getcharcountArray(str);
        int index = -1;
        for(int i=0; i<str.length();i++){
            if (count[str.charAt(i)]==1){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){

        System.out.print("Enter ur word::");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int index = repeatCharcount(str);
        System.out.println(index == -1 ?"Either all the characters of the string are repeating or string "+"is empty": "First non repeating character is :: " + str.charAt(index));
        sc.close();
    }
    
}
