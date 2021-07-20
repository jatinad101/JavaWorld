package BigInteger;

import java.util.stream.Stream;


public class stream1 {
    public static void main (String[] args) {


	
         Stream.iterate(1, x -> x + 1)
        .filter(x -> x.toString().contains("5"))
        .limit(10)
        .forEach(System.out::println);

        // fibonacci Series using stream
        
        System.out.println("The Fibonacci series is::");
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1],n[0]+n[1]})
        .limit(10)
        .map(n -> n[0])
        .forEach(n -> System.out.println(n));

        // fibonacci Series sum
        
        int sum = Stream.iterate(new int[]{0,1},n -> new int[]{n[1],n[0]+n[1]})
                 .limit(10)
                 .map(n -> n[0])
                 .mapToInt(n -> n)
                 .sum();
        System.out.print("The Sum of the fibonacci series is::" + sum);
       }
    
}
