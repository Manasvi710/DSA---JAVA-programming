package assignment_Matrix;

import java.util.Arrays;

public class que_5 {
    public static void main(String[] args) {
        int [] [] mat={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};

        int row= mat.length;
        int col=mat[0].length;

        int[][]mat1=new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat1[j][row-1-i]=mat[i][j];
            }
        }
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[0].length; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
