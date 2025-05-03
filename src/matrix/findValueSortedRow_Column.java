package matrix;

public class findValueSortedRow_Column {
    public static void main(String[] args) {
        int [][] mat={{2,9,15,20},
                {3,12,16,28},
                {5,13,18,32},
                {8,14,19,38}};
        int value=20;

        int row=mat.length;
        int col=mat[0].length;
        int i=0;
        int j=col-1;
        while(i<row && j>=0){
            if(mat[i][j]==value){
                System.out.println("present");
                return;
            } else if (mat[i][j] < value) {
                i++;
            }else{
                j--;
            }
        }
        System.out.println("not present");
    }
}
