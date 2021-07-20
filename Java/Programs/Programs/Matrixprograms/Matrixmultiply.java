package Programs.Matrixprograms;
import java.util.*;
public class Matrixmultiply {
    public static void main(String[] args){
        System.out.println("Enter the rows of the first matrix ::");
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();

        System.out.println("Enter the columns of the first matrix ::");
        int col1 = sc.nextInt();
        
        System.out.println("Enter the rows of the second matrix ::");
        int row2 = sc.nextInt();

        System.out.println("Enter the columns of the second matrix ::");
        int col2 = sc.nextInt();

        int[][] first = new int[row1][col1];
        int[][] second = new int[row2][col2];

        for(int r=0; r<row1; r++){
            for(int c=0; c<col1; c++){
                System.out.print(String.format("Enter the element of first matrix[%d][%d]::",r,c));
                first[r][c] = sc.nextInt();
            }
        }
        for(int r=0; r<row2; r++){
            for(int c=0; c<col2; c++){
                System.out.print(String.format("Enter the element of the second matrix[%d][%d]::",r,c));
                second[r][c] = sc.nextInt();
            }
        }

        System.out.println("First Matrix ::");
        print2dArray(first,row1,col1);

        System.out.println("Second Matrix ::");
        print2dArray(second,row2,col2);

        System.out.println("Matrix multiplication::");
        multiply(row1, col1, first, row2, col2, second);

        sc.close();
    }
    private static void multiply(int row1,int col1,int[][] first, int row2, int col2, int[][] second){
        if(col1 != row2){
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int[][] third = new int[row1][col2];
        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                for(int k=0; k<row2; k++){
                    third[i][j] += first[i][k]*second[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix ::");
        print2dArray(third, row1, col2);

    }
    private static void print2dArray(int[][] M,int row, int col){
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(M[r][c]+"\t");
            }
            System.out.println();
        }

    }
         
}
