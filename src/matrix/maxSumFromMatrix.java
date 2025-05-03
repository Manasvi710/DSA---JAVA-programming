package matrix;

public class maxSumFromMatrix {
    public static void main(String[] args) {
        int [][]mat={{1,4,10,3},
                {4,10,20,3},
                {5,4,10,2}};
        int row=mat.length, col=mat[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 && j==0){
                }else if(i==0){
                    mat[i][j]=mat[i][j]+mat[i][j-1];
                }else if(j==0){
                    mat[i][j]=mat[i][j]+mat[i-1][j];
                }else{
                    mat[i][j]=mat[i][j]+Math.min(mat[i][j-1],mat[i-1][j]);
                }
            }
        }
        System.out.println(mat[row-1][col-1]);
    }
}
