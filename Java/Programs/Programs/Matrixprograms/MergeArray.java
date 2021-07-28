package Programs.Matrixprograms;

public class MergeArray {
    public static void main(String[] args){
        int []arr1 = {1,3,4,6};
        int []arr2 = {2,5,7,8};
        int m = arr1.length, n = arr2.length;
        mergingarr(arr1,arr2,m,n); 
    }

    private static void mergingarr(int[] arr1, int[] arr2, int m, int n) {

        int i=0,j=0,k=0;
        int res[] = new int[m+n];
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                res[k++] = arr1[i++];
            }
            else{
                res[k++] = arr2[j++];
            }
        }
        while (i < m)
            res[k++] = arr1[i++];
 
        while (j < n)
            res[k++] = arr2[j++];

        for(int l=0;l<m+n;l++){
            System.out.print(res[l]+" ");
        }
    }
}
