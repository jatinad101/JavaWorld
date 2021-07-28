package Programs.Matrixprograms;

class RangeSumArray {
    
    public static void preComputeArray(int[] arr, int n, int[] pre) {
            pre[0] = arr[0];
            for(int i =1;i<n;i++){
                pre[i] = arr[i] + pre[i-1];
            }
    }
    public static int rangeSumarray(int i,int j, int []pre){
        if (i==0)
           return pre[j];
        
        return pre[j]-pre[i-1] ;

    } 

    public static void main(String[] args){
        int a[] = {10,20,30,40,60},n=5;
        int b[] = new int[5];
        preComputeArray(a,n,b);
        System.out.print(rangeSumarray(1,3,b));
         
    }

}
