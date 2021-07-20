package Programs.Matrixprograms;

import java.util.*;

public class Matrixprogram {
    public static void main(String[] args){
    
        System.out.println("Enter the rows in the matrix::");
        Scanner sc = new Scanner(System.in);
        int row  = sc.nextInt();

        System.out.println("Enter the columns in the matrix::");
        int col = sc.nextInt();

        int[][] first  = new int[row][col];
        int[][] second = new int[row][col]; 
        
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                System.out.println(String.format("Enter first integer first[%d][%d]",r,c));
                first[r][c] = sc.nextInt();
            }
        }
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                System.out.println(String.format("Enter second integer second[%d][%d]",r,c));
                second[r][c] = sc.nextInt();
            }
        }
        sc.close();

        System.out.print("First Array::"+"\n");
        print2dArray(first);

        System.out.print("Second Array::"+"\n");
        print2dArray(second);

        sum(first,second);
        subtract(first,second);
    }

    private static void sum(int[][] first, int[][] second){
        int row  = first.length;
        int col  = first[0].length;
        int[][] sum = new int[row][col];
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                sum[r][c] = first[r][c] + second[r][c];
            }
        }
        System.out.println("Sum of Matrices::");
        print2dArray(sum);
    } 
    private static void subtract(int[][] first, int[][] second){
        int row = first.length;
        int col = first[0].length;
        int[][] sub = new int[row][col];
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                sub[r][c] = first[r][c] - second[r][c];                
            }
        }
        System.out.println("Difference of Matrices::");
        print2dArray(sub);
    }

    private static void print2dArray(int[][] matrix){
        for (int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[0].length; c++){
                System.out.print(matrix[r][c]+"\t");
            }
            System.out.println();
        }

    }

}
