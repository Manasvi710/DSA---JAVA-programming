package assignment_Matrix;

public class que_3 {
    public static void main(String[] args) {
        int [][]mat= {{1,2,3},
                {4,5,6},
                {7,8,9},
                };
        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        int j=0;
        for(int i=0; i<row; i++){
            sum+=mat[i][i];
            j++;
        }
        int k=col-1;
        for(int i=0; i<row; i++){
            sum+=mat[i][k];
            k--;
        }
        if(row%2!=0){
            sum=sum-mat[row/2][col/2];
        }
        System.out.print(sum);
    }
}
