package Programs.Matrixprograms;

import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args){
        int []arr = {99,28,74,21,54,12};
        String []strarr = {"e","U","o","I","A"};

        Arrays.sort(arr);
        Arrays.sort(strarr);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strarr));

    }
    
}
