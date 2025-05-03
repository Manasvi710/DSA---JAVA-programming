package matrix;

public class findValueSortedMatrix {
    public static void main(String[] args) {
        int [][] mat={{1,4,8,10},
                {12,15,17,19},
                {22,25,28,30},
                {35,38,40,50},
                {55,67,87,99}};
        int value=39;

        int row=mat.length, col=mat[0].length;
        int firstRow=0, lastRow=row-1;
        int rowToBeSearch=-1;

        while(firstRow<=lastRow){
            int midRow=(firstRow + lastRow)/2;
            if(mat[midRow][0] <=value && mat[midRow][col-1]>=value){
                rowToBeSearch=midRow;
                break;
            }else if(value > mat[midRow][col-1]){
                firstRow=midRow+1;
            }else{
                lastRow=midRow-1;
            }
        }
        if(rowToBeSearch == -1){
            System.out.println("Not present");
            return;
        }
        int left=0, right=col-1;
        while (left <= right){
            int mid=(left+right)/2;
            if(mat[rowToBeSearch][mid]==value){
                System.out.println("present");
                return;
            }else if(value > mat[rowToBeSearch][mid]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        System.out.println("not present");
    }
}
