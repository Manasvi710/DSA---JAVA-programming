package assignment_Matrix;

public class que_6 {
    public static void main(String[] args) {
        int [] [] mat={
                {1,1,0},
                {0,0,0},
                {0,0,1}};

        int row= mat.length;
        int col=mat[0].length;

        int maxRow=0;
        int count1=0;
        for(int i=0; i<row; i++){
            int count=0;
            for(int j=0; j<row;j++){
                if(mat[i][j]==1) {
                    count++;
                }
            }
            if(count>count1){
                count1=count;
                maxRow=i;
            }
        }
        System.out.println(maxRow);
    }
}
