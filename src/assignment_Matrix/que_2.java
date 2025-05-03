package assignment_Matrix;

public class que_2 {
    public static void main(String[] args) {
        int [][]mat={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        int row=mat.length;
        int col=mat[0].length;

        int j=col-1;
        for(int i=0; i<row; i++){
            System.out.print(mat[i][j] + " ");
            j--;
        }
    }
}
