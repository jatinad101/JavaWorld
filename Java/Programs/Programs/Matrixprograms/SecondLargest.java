package Programs.Matrixprograms;

public class SecondLargest {
    static int secondLarge(int []arr, int n){
           int res = -1,largest=0;
           for(int i=1;i<n;i++){
               if(arr[i]>arr[largest]){
                   res = largest;
                   largest=i;
               }
               else if(arr[i]!=arr[largest]){
                   if(res==-1 || arr[i]>arr[res]){
                       res = i;
                   }

               }

           }
           return res;
    }
    public static void main(String[] args){
        int []a = {10,25,22,18,9};
        int n = a.length;
        int x = secondLarge(a, n);
        System.out.print("Second largest element in the array is :: "+a[x]);
    }
    
}
