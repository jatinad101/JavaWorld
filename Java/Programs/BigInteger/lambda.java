package BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class lambda {
       static void printCond(Collection <Integer> c, Predicate <Integer> p){
               for(Integer x:c){
                   if (p.test(x)){
                       System.out.print("Even numbers are::"+x+"\n ");
                   }
               }
       }
       public static void main(String[] args) {
           List <Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
           printCond(al, x -> x % 2==0);
           
       }
}
