package BigInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

   


    public static void main(String[] args){

        List<Integer> l = new ArrayList<>(Arrays.asList(5,10,20,30,8,7));
        l.stream().filter(x -> x % 2 == 0).filter(x -> x > 10).forEach(System.out :: println);
        System.out.println("Square of the number are ::");
        l.forEach(Stream :: printSquare);

        int[] arr ={10,30,50,70,20};
        int sum = Arrays.stream(arr).sum();
        System.out.print("Sum of the array elements is --> " + sum);
        
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.print("Maximum element from the array is --> "+ max);



    }  
    
   

    


    static void printSquare(Integer y){

        System.out.println(y*y);
    }
    
}
