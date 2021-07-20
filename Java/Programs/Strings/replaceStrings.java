package Strings;

import java.util.Scanner;

public class replaceStrings {
       public static void main(String []args){
           System.out.print("Enter ur string::");
           Scanner s = new Scanner(System.in);
           String a = s.nextLine();

           System.out.print("Enter character 2 replace from the string::");
           String b =  s.nextLine();
                      
           removeAllcharacters(a,b);
    
           s.close();
       }
       private static void removeAllcharacters(String a,String b){
            String result = a.replaceAll(String.valueOf(b), "");
            System.out.print(result);   
           
       }
}
