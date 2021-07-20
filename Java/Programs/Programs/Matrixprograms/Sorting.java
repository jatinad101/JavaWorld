package Programs.Matrixprograms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int []A = new int[10];
        populateArray(A);
        System.out.print("Before Sorting::");
        printArray(A);
        BubbleSort(A);
        System.out.print("\nAfter  Bubble Sorting::");
        printArray(A);
        insertionSort(A);
        System.out.print("\nAfter Insertion Sort::");
        printArray(A);
    }
    private static int[] BubbleSort(int []B){
        int temp;
        for(int i=0; i < B.length; i++){
            for(int j=1; j<B.length-i;j++){
                if (B[j-1]>B[j]){
                    temp = B[j-1];
                    B[j-1] = B[j];
                    B[j] = temp;
                }
            }
            System.out.println("Array after "+(i+1)+"th iteration::"+Arrays.toString(B));
        }
        return B;
    }
    private static int[] insertionSort(int []B){
        for(int i=1; i<B.length; i++){
            int valueSort = B[i];
            int j=i;
            while(j>0 && B[j-1]>valueSort){
                B[j] = B[j-1];
                j--;
            }
            B[j] = valueSort;
        }
        return B;
    }

    private static void populateArray(int []B){
        for(int i=0;i<B.length;i++){
            B[i] = (int) (Math.random()*100);
        }
    }
    private static void printArray(int []B){
        System.out.println(Arrays.toString(B));
    }
}
