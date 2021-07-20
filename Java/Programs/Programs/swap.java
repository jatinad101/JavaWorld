package Programs;


import java.util.*;
public class swap {
    public static void main(String[]args)
    {
        int temp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no::");
        int x =sc.nextInt();

        System.out.println("Enter second no::");
        int y = sc.nextInt();

        System.out.println(x+" "+y);

        temp = x;
        x = y;
        y = temp;
        
        System.out.println(x+" "+y);
        sc.close();


    }
    
}
