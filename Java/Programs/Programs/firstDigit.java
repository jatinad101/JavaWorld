package Programs;
import java.util.*;

public class firstDigit {
    public static int firstdigit(int n){
        double power=Math.log10(n);
        int p=(int)power;
        int a=(int)Math.pow(10,p);
        int ans=n/a;
        return ans;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.print(firstdigit(n));
        sc.close();
    }
       
}
