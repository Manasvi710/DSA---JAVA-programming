package matrix;

public class deleteMaxFromEachColumn {
    public static void main(String[] args) {

        int[][] mat = {{2, 9, 4, 7},
                       {10, 5, 2,6},
                       {1, 6, 1, 8}};

        int row = mat.length;
        int col = mat[0].length;

        for(int i=0; i<col; i++){
            int maxVal=Integer.MIN_VALUE;
            int maxIndex=0;
            for(int j=0; j<row; j++){
                if(mat[j][i]>maxVal){
                    maxVal=mat[j][i];
                    maxIndex=j;

                }
            }
            for(int k=maxIndex; k<row-1; k++){
                mat[k][i]=mat[k+1][i];
            }
        }
        row--;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
