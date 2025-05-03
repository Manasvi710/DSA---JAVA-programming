package assignment_Matrix;

public class que_1 {
    public static void main(String[] args) {
        int [][]mat= {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        int j=0;
        for(int i=0; i<row; i++){
                System.out.print(mat[i][j] + " ");
                j++;
        }
    }
}
