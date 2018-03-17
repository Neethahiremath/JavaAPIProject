package com.sample.service.JavaPrograms;

public class TwoDArraySorting {

    public static void main(String[] args) {

        int[][] array = {
                {17, 12, 13, 2},
                {4, 7, 8, 9},
                {4, 6, 1, 7}
        };
        int small, row = 0, col = 0, z;

        for (int k = 0; k < array.length; k++) {
            for (int p = 0; p < array[k].length; p++) {
                small = array[k][p];
                for (int i = k; i < array.length; i++) {
                    if (i == k)
                        z = p + 1;
                    else
                        z = 0;
                    for (; z < array[i].length; z++) {
                        if (array[i][z] <= small) {
                            small = array[i][z];
                            row = i;
                            col = z;
                        }
                    }
                }
                array[row][col] = array[k][p];
                array[k][p] = small;
                System.out.print(array[k][p] + " ");
            }
            System.out.println();
        }
    }
}
