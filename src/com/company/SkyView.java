package com.company;

public class SkyView {
    public double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned){
        view = new[numRows][numCols];
        int x=0;
        for (int i = 0; i < view.length; i ++){
            if (i % 2 == 0){
                for (int j = 0; j < view[i].length; j++){
                    view[i][j] = scanned[x];
                    x++;
                }
            else{
                for (int j = view[i].length - 1; j >= 0; j--){
                    view[i][j] = scanned[x];
                    x++;
                }
            }
        }

            public double getAverage ( int startRow, int endRow, int startCol, int endCol){
            }
        }


