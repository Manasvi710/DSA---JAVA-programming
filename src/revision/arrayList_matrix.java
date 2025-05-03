package revision;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_matrix {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(8);

//        int sum=32;
//        int left=0;
//        int right=arrayList.size()-1;
//        while (left<right){
//            if(arrayList.get(left)+ arrayList.get(right)==sum){
//                System.out.println("present");
//                return;
//            }else if(arrayList.get(left)+arrayList.get(right)<sum){
//                left++;
//            }else{
//                right--;
//            }
//        }
//        System.out.println("not present");

//        int odd=0;
//        int even=0;
//        for(int i=0; i<arrayList.size(); i++){
//            if(arrayList.get(i)%2 == 1){
//                odd++;
//            }else {
//                even++;
//            }
//        }
//        System.out.println("odd " + odd);
//        System.out.println("even " + even);

//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<arrayList.size(); i++){
//            if(arrayList.get(i) > max){
//                max=arrayList.get(i);
//            }
//        }
//        System.out.println(max);

//        ArrayList<Integer> arrayList2=new ArrayList<>();
//        ArrayList<Integer> arrayList3=new ArrayList<>();
//
//        arrayList2.add(12);
//        arrayList2.add(6);
//        arrayList2.add(7);
//        arrayList2.add(8);
//        arrayList2.add(9);
//
//        arrayList3.addAll(arrayList);
//        arrayList3.addAll(arrayList2);
//
//        Collections.sort(arrayList3);
//
//        System.out.println(arrayList3);

        // ------------------------- Matrix ------------------------//

        int [][]mat={{1,2,3,4},
                {1,6,1,8},
                {9,10,11,12}};
        int row=mat.length;
        int col= mat[0].length;


//        int sum=0;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                sum=sum+mat[i][j];
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
//            }else {
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
//            if(sum>max){
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


//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                if(i==0 && j==0) {
//                }else if(i==0){
//                    mat[i][j]=mat[i][j]+mat[i][j-1];
//                }else if(j==0){
//                    mat[i][j]=mat[i][j]+mat[i-1][j];
//                }else {
//                    mat[i][j]=mat[i][j]+Math.min(mat[i][j-1], mat[i-1][j]);
//                }
//            }
//        }
//        System.out.println(mat[row-1][col-1]);


//        int value=12;
//       int i=0;
//       int j=col-1;
//       while (i<row && j>=0){
//           if(mat[i][j]==value){
//               System.out.println("present");
//               return;
//           }else if(mat[i][j] < value){
//               i++;
//           }else {
//               j--;
//           }
//       }
//        System.out.println("not present");

//        int value=13;
//        int firstRow=0;
//        int lastRow=row-1;
//        int rowTobeSearch=-1;
//        while (firstRow<=lastRow){
//            int rowMid=(firstRow+lastRow)/2;
//            if(mat[rowMid][0]<=value && mat[rowMid][col-1]>=value){
//                rowTobeSearch=rowMid;
//                break;
//            }else if(mat[rowMid][col-1]<value){
//                firstRow=rowMid+1;
//            }else {
//                lastRow=rowMid-1;
//            }
//        }
//        if(rowTobeSearch==-1) {
//            System.out.println("not present");
//            return;
//        }
//        int left=0;
//        int right=col-1;
//        while (left<=right){
//            int mid=(left+right)/2;
//            if(mat[rowTobeSearch][mid] == value){
//                System.out.println("present");
//                return;
//            }else if(mat[rowTobeSearch][mid]<value){
//                left=mid+1;
//            }else {
//                right=mid-1;
//            }
//        }
//        System.out.println("not present");

//        for(int i=0; i<row; i++){
//            int maxIndex=0;
//            for(int j=0; j<col; j++){
//                if(mat[i][j] >mat[i][maxIndex]){
//                    maxIndex=j;
//                }
//            }
//            for(int k=maxIndex; k<col-1; k++){
//                mat[i][k]=mat[i][k+1];
//            }
//        }
//        col--;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int i=0; i<col; i++){
//            int maxIndex=0;
//            int maxval=Integer.MIN_VALUE;
//            for(int j=0; j<row; j++){
//                if(mat[j][i] > maxval){
//                    maxval=mat[j][i];
//                      maxIndex=j;
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
//        if(row%2 != 0){
//            sum=sum-mat[row/2][col/2];
//        }
//        System.out.println(sum);

//       int sum=12;
//       for(int i=0; i<row; i++){
//           for(int j=0; j<col; j++){
//               int val=mat[i][j];
//               for(int k=0; k<row; k++){
//                   for(int k2=0; k2<col; k2++){
//                       if(mat[k][k2]+val==sum){
//                           System.out.println("present");
//                           return;
//                       }
//                   }
//               }
//           }
//       }
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

//        int maxRow=0;
//        int count=0;
//        for(int i=0; i<row; i++){
//            int count1=0;
//            for(int j=0; j<col; j++){
//                if(mat[i][j] ==1){
//                    count1++;
//                }
//            }
//            if(count1>count){
//                count=count1;
//                maxRow=i;
//            }
//        }
//        System.out.println(maxRow);
    }
}
