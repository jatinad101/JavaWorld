package Programs.Matrixprograms;

public class InsertionArray {
    static int Insertion(int arr[],int n,int cap, int pos, int val){
      
        if (n == cap){
            return n;
        }
        int idx = pos-1;
        for(int i=n-1; i>=idx; i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = val;
        return n+1;
    }
    public static void main(String[] args){
        int []a = new int[6];
        a[0] = 2; a[1]=12; a[2]=45; a[3]=54; a[4]=19;
        int c=6,n=5;
        System.out.print("Before Insertion :: ");
        for(int i=0; i<c; i++){
            System.out.print(a[i]+" ");
        }
        int p=2,v=15;
        int x = Insertion(a,n,c,p,v);
        System.out.print("\nAfter Insertion :: ");
        for(int i =0; i<x; i++){
            System.out.print(a[i]+" ");
        }

    }
}
