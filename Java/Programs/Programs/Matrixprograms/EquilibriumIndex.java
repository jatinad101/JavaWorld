package Programs.Matrixprograms;

public class EquilibriumIndex {
    static int equiIndex(int []arr,int n){
        int leftsum,rightsum;
        for(int i=0; i<n; i++){
            leftsum = 0;
            for(int j=0;j<i;j++){
                leftsum+=arr[j];
            }
            rightsum = 0;
            for(int j=i+1;j<n;j++){
                rightsum+=arr[j];
            }
            if (leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[] = {5,4,3,2,3,4,5};
        int a_size = a.length;
        System.out.println(equiIndex(a, a_size));
    }
    
}
