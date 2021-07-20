import java.util.*;
public class Wimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the cart ::");
        int count  =  sc.nextInt();
        int[] list = new int[count];

        for(int i=0;i<count;i++){
            System.out.print(String.format("Enter the package in the list[%d]::",i));
            list[i] =sc.nextInt();
        }
        sc.close();

        System.out.println("Display the package::");
        display(list);
        
        sort(list);

       

    }
    private static void sort(int[] L){
        int temp=0;
        for(int i=0; i<L.length; i++){
            for(int j=i+1; j<L.length; j++){
                if(L[i] > L[j]){
                    temp = L[i];
                    L[i] = L[j];
                    L[j] = temp;
                }
            }
        }
        System.out.println("Display the sorted package::");
        display(L);


    }
    private static void display(int[] M){
        
        for(int i=0; i<M.length; i++){
            System.out.print(M[i]+"\t");
        }
        System.out.println();

    }
    
}
