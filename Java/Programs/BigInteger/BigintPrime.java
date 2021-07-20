package BigInteger;
import java.math.BigInteger;
import java.util.*;

public class BigintPrime {
    public static void main(String[] args){
        System.out.print("Enter the number 2 check whether its prime or not::");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(isPrime(n));
        System.out.println(nextPrime(n));
        s.close();
    }
    public static boolean isPrime(int n){
        BigInteger a = BigInteger.valueOf(n);
        return a.isProbablePrime(1);
    }
    public static int nextPrime(int n){
        System.out.println("Print the next prime number::");
        BigInteger b = BigInteger.valueOf(n);
        String c =  b.nextProbablePrime().toString();

        return Integer.parseInt(c);
    }
    
}
