package Programs.Matrixprograms;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    static boolean isArmstrong (int n){
        int d=0, k, rem, res=0;
        k = n;
        while(k>0){
            k = k/10;
            d++;
        }                                                                                                                                                                                                                                                                                         
        k=n;
        while(k>0){
            rem = k%10;
            res = res + (int)(Math.pow(rem, d));
            k = k/10;
        }
    
        if (res == n){
            return true;                                                                                                                                                  
               }else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur limit::");
        
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
