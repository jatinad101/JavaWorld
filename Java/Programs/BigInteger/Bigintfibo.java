package BigInteger;
import java.math.BigInteger;
import java.util.*;

public class Bigintfibo {
    public static void main(String[] args){
        System.out.println("Enter the number upto which fibonacci series needs to be find::");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(fibo(n));
        s.close();
    }
    public static BigInteger fibo(int n){
        BigInteger a =  BigInteger.valueOf(0);
        BigInteger b =  BigInteger.valueOf(1);
        BigInteger c =  BigInteger.valueOf(1);
        for (int j=2; j<=n; j++){
            c = a.add(b);
            a = b;
            b = c;  
        }
        return b;
    }
    
}
