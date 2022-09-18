package com.company.arrays;

public class Spiral2DArray {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};
        spiral(arr);
    }

    private static void spiral(int[][] arr) {
        int startRow = 0;
        int startcol = 0;
        int endcol = arr[0].length-1;
        int endRow = arr.length-1;
        while (startRow<=endRow&&startcol<=endcol){
            //top
            for (int i = startcol; i <=endcol ; i++) {

                System.out.print(arr[startRow][i]+",");
            }
            // right
            for (int i = startRow+1; i <=endRow; i++) {
                System.out.print(arr[i][endcol]+",");
            }
            //bottom
            for (int i = endcol-1; i >=startcol ; i--) {
                if(startRow==endRow) // condition where midlle is printed extra as it is been already been printed by top
                    break;
                System.out.print(arr[endRow][i]+",");
            }
            //left
            for (int i = endRow-1; i >=startRow+1 ; i--) {
                if(startcol==endcol)
                    break;
                System.out.print(arr[i][startcol]+",");
            }
            startcol++;
            startRow++;
            endcol--;
            endRow--;

        }
    }


}
