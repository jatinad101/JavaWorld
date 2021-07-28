package Programs.Matrixprograms;

public class LargestSumsubarray {
       

    public static void main(String[] args){
        int a[] = {10,21,-1,44,-19,-22,11};
        int a_length = a.length;
        System.out.print(largestSumsubarr(a,a_length));  
    }

    private static int largestSumsubarr(int[] arr, int n) {
        int max_so_far=arr[0];
        int max_ending_here = 0;

        for(int i=0; i<n; i++){
            max_ending_here += arr[i];

            if(max_ending_here>max_so_far){
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    
}
