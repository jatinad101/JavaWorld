package Programs;


public class printDivisors {

        static void printdivisors(int n)
        {
            int i = 1;
            for(i=1; i*i < n; i++)
            {
                if(n % i == 0)
                {
                    System.out.print(i+" ");
                }
            }
    
            for(; i >= 1; i--)
            { 
                if(n % i == 0)
                {
                    System.out.print((n / i)+" ");
                }
            }
        }
    
        public static void main (String[] args) {
            
            int n = 12;
    
            printdivisors(n);
    
        }
}
