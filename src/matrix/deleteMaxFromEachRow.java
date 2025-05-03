package matrix;

public class deleteMaxFromEachRow {
    public static void main(String[] args) {

        int[][] mat = {{2, 9, 4, 7},
                       {10, 5, 2,6},
                       {1, 6, 2, 8}};

        int row = mat.length;
        int col = mat[0].length;

        for(int i=0; i<row; i++){
            int maxIndex=0;
            for(int j=0; j<col; j++){
                if(mat[i][j]>mat[i][maxIndex]){
                    maxIndex=j;
                }
            }
            for(int k=maxIndex; k<col-1; k++){
                mat[i][k]=mat[i][k+1];
            }
        }
        col--;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
