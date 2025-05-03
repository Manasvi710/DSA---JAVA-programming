package practice;

public class matrix {
    public static void main(String[] args) {
        int [] [] mat={{1,0,1,4},
                {1,6,0,8},
                {9,1,11,12}};
        int row=mat.length;
        int col=mat[0].length;
//        int sum=0;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                sum+=mat[i][j];
//            }
//        }
//        System.out.println(sum);

//        for(int i=row-1; i>=0; i--){
//            for(int j=col-1; j>=0; j--){
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int i=0; i<row; i++){
//            for(int j=col-1; j>=0; j--){
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int i=0; i<col; i++){
//            for(int j=0; j<row; j++){
//                System.out.print(mat[j][i] + " ");
//            }
//            System.out.println();
//        }
//        for(int i=0; i<row; i++){
//            if(i%2 == 0){
//                for(int j=0; j<col; j++){
//                    System.out.print(mat[i][j] + " ");
//                }
//            }
//            else {
//                for(int j=col-1; j>=0; j--){
//                    System.out.print(mat[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }

//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<row; i++){
//            int sum=0;
//            for(int j=0; j<col; j++){
//                sum+=mat[i][j];
//            }
//            if(sum > max){
//                max=sum;
//            }
//        }
//        System.out.println(max);

//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<col; i++){
//            int sum=0;
//            for(int j=0; j<row; j++){
//                sum+=mat[j][i];
//            }
//            if(sum>max){
//                max=sum;
//            }
//        }
//        System.out.println(max);

//          for(int i=0; i<row; i++){
//              int maxIndex=0;
//              for(int j=0; j<col; j++){
//                  if(mat[i][j]>mat[i][maxIndex]){
//                      maxIndex=j;
//                  }
//              }
//              for(int k=maxIndex; k<col-1; k++){
//                  mat[i][k]=mat[i][k+1];
//              }
//          }
//          col--;
//          for(int i=0; i<row; i++){
//              for(int j=0; j<col; j++){
//                  System.out.print(mat[i][j] + " ");
//              }
//              System.out.println();
//          }

//        for(int i=0; i<col; i++){
//            int maxval=Integer.MIN_VALUE;
//            int maxIndex=0;
//            for(int j=0; j<row; j++){
//                if(mat[j][i]>maxval){
//                    maxval=mat[j][i];
//                    maxIndex=j;
//                }
//            }
//            for(int k=maxIndex; k<row-1; k++){
//                mat[k][i]=mat[k+1][i];
//            }
//        }
//        row--;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

//         for(int i=0; i<row; i++){
//             System.out.print(mat[i][i] + " ");
//         }
//        System.out.println();

//        int j=col-1;
//        for(int i=0; i<row; i++){
//            System.out.print(mat[i][j] + " ");
//            j--;
//        }

//        System.out.println();
//        int j=0;
//        int sum=0;
//        for(int i=0; i<row; i++){
//            sum+=mat[i][j];
//            j++;
//        }
//        int k=col-1;
//        for(int i=0; i<row; i++){
//            sum+=mat[i][k];
//            k--;
//        }
//        if(row%2 !=0){
//            sum=sum-mat[row/2][col/2];
//        }
//        System.out.println(sum);

//          int sum=17;
//          for(int i=0; i<row; i++){
//              for(int j=0; j<col; j++){
//                  int val=mat[i][j];
//                  for(int k=0; k<row; k++){
//                      for(int k2=0; k2<col; k2++) {
//                          if (mat[k][k2]+val == sum){
//                              System.out.println("presnet");
//                              return;
//                          }
//                      }
//                  }
//              }
//          }
//        System.out.println("not present");

//        int [][]mat1=new int[col][row];
//
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                mat1[j][row-1-i]=mat[i][j];
//            }
//        }
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[0].length; j++){
//                System.out.print(mat1[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for(int i=0; i<row; i++){
//            System.out.print(mat[i][i] + " ");
//        }
//        int j=col-1;
//        for(int i=0; i<row; i++){
//            System.out.print(mat[i][j] + " ");
//            j--;
//        }
//        int sum=0;
//        int j=0;
//        for(int i=0; i<row; i++){
//            sum+=mat[i][j];
//            j++;
//        }
//        int k=col-1;
//        for(int i=0; i<row; i++){
//            sum+=mat[i][k];
//            k--;
//        }
//        if(row%2 !=0){
//            sum=sum-mat[row/2][col/2];
//        }
//        System.out.println(sum);
//        int sum=40;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                int v=mat[i][j];
//                for(int k=0; k<row; k++){
//                    for(int k2=0; k2<col; k2++){
//                        if(mat[k][k2]+v==sum){
//                            System.out.println("present");
//                            return;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("Not present");
//        int value=12;
//        int i=0;
//        int j=col-1;
//        while (i<row && j>=0){
//           if(mat[i][j]==value){
//               System.out.println("present");
//               return;
//           }else if(mat[i][j] < value){
//               i++;
//           }else{
//               j--;
//           }
//        }
//        System.out.println("Not present");
//         int[][]mat1=new int[col][row];
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 mat1[j][row-1-i]=mat[i][j];
//             }
//         }
//         for(int i=0; i<mat1.length; i++){
//             for(int j=0; j<mat1[0].length; j++){
//                 System.out.print(mat1[i][j] + " ");
//             }
//             System.out.println();
//         }
        int maxRow=0;
        int count=0;

        for(int i=0; i<row; i++){
            int count1=0;
            for(int j=0; j<row; j++){
                if(mat[i][j]==1){
                    count1++;
                }
            }
            if(count1>count){
                count=count1;
                maxRow=i;
            }
        }
        System.out.println(maxRow);
    }
}
