package matrix;

public class maxSumFromColumn {
    public static void main(String[] args) {
        int [][] mat={{1,3,6,4}, {4,6,5,2}, {4,6,2,8}};

        int row= mat.length;
        int col=mat[0].length;

        int max=Integer.MIN_VALUE;
        for(int i=0; i<col; i++){
            int sum=0;
            for(int j=0; j<row; j++){
                sum+=mat[j][i];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
