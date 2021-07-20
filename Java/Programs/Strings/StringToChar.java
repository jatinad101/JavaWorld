package Strings;


public class StringToChar {
    public static void main(String[] args){
        String str = "Journaldev";
    
        //String to char array
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        
        //Character at Specific index
        char c =str.charAt(2);
        System.out.println(c);
        

        char[] chars1 = new char[7];
        str.getChars(0, 7, chars1, 0);
        System.out.println(chars1);
    }
    


}
