package BigInteger;
import java.math.BigInteger;
import java.util.*;

public class Bigintfib {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println(fact(a));
        s.close();
    }
    public static BigInteger fact(int a){
        BigInteger f = new BigInteger("1");
        for(int i=2; i<=a; i++){
            BigInteger x = BigInteger.valueOf(i);
            f = f.multiply(x);
        }
        return f;

    }

    
}
