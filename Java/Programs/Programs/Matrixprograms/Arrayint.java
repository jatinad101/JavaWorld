package Programs.Matrixprograms;

import java.util.Scanner;

public class Arrayint {
    
       public static void main(String[] args ){
              //multidimensional array initialization with only leftmost dimension
              Scanner s = new Scanner(System.in);
              int[][] twoIntArr = new int[5][];
              twoIntArr[0] = new int[5];
              twoIntArr[1] = new int[5]; //complete initialization is required before we use the array
 
              
              for(int i=0;i<twoIntArr.length;i++){
                  for(int j=0;j<twoIntArr[0].length;j++){
                      System.out.print(twoIntArr[i][j]+"\t");
                  }
                  System.out.println();
              }

              s.close();
       }

}
