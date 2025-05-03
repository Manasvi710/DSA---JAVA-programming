package assignment_Matrix;

public class que_4 {
    public static void main(String[] args) {
        int [][]mat={{1,9,4},
        {0,3,8},
        {11,5,9}};

        int row= mat.length;
        int col=mat[0].length;
        int sum=7;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int val = mat[i][j];
                for(int k=0; k<row; k++){
                    for(int k2=0; k2<col; k2++){
                       if(mat[k][k2]+val==sum){
                         System.out.println("present");
                         return;
                       }
                   }
                }
            }
        }
        System.out.println("not present");
    }
}
