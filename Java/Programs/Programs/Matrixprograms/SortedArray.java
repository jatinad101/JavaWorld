package Programs.Matrixprograms;

public class SortedArray {
    static boolean isSorted(int arr[],int n){
           for(int i=1; i<n; i++){
               if(arr[i-1]>arr[i]){
                   return false;
               }
           } 
           return false;
    }   
    public static void main(String[] args){
        int a[] = {25,32,14,28,11},n=5;
        System.out.print(isSorted(a, n));

    }
}
