package Programs.Matrixprograms;


public class ReverseArray {
       static void revArray(int[] arr,int n){
              int low = 0 , high = n-1;
              while(low<high){
                     int temp = arr[low];
                     arr[low] = arr [high];
                     arr[high] = temp;
                     low++;
                     high--;
              }             
       }
       public static void main(String[] args){
              int n=5;
              int a[] = {10,22,54,67,43};
              System.out.print("Before Reversing an Array :: ");
              for(int i=0;i<a.length;i++){
                     System.out.print(a[i]+" ");
              }
              revArray(a,n);
              System.out.print("\nAfter Reversing an Array :: ");
              for(int i=0;i<a.length;i++){
                     System.out.print(a[i]+" ");
              }
       }     
}