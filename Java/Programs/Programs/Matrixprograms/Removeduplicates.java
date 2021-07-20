package Programs.Matrixprograms;

public class Removeduplicates {
    static int removeDuplicates(int []arr,int n){
        int res=1;
        for(int i=1; i<n; i++){
            if(arr[res-1]!=arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    
    public static void main(String[] args){
        int []a = {10,10,20,40,50,60,60,70};
        int n  = a.length;
        System.out.print("Before removing duplicate elements :: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        int x = removeDuplicates(a, n);
        System.out.print("\nAfter removing duplicate elements :: ");
        for(int i=0; i<x; i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
