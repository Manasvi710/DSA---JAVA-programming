package matrix;

public class sumOfMatrix {
    public static void main(String[] args){
        int mat[][]={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sum=sum+mat[i][j];
            }
        }
        System.out.println(sum);
    }
}
