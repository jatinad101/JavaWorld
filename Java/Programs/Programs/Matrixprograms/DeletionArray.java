package Programs.Matrixprograms;

public class DeletionArray {
    static int DeleteEle(int []arr, int val){
        int i=0,n=arr.length;
        for(i=0;i<arr.length;i++){
            if(arr[i]==val){
                break;
            }
        }
        if (i == n)
            return n;
        for(int j=i; j<n-1; j++){
            arr[j] = arr[j+1];
        }
        return n-1;
    }   
    public static void main(String[] args){
        int a[] ={12,19,55,32,4},k=19;
        System.out.print("Before Deletion :: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        int x = DeleteEle(a, k);
        System.out.print("\nAfter Deletion:: ");
        for(int i=0; i<x; i++){
            System.out.print(a[i]+" ");
        } 
    } 
}
