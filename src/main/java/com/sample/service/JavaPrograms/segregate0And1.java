package com.sample.service.JavaPrograms;

public class segregate0And1 {

    static void segregate0and1(int arr[], int n) {
        int type0 = 0;
        int type1 = n - 1;
        RotationOfString rotate = new RotationOfString();

        while (type0 < type1) {

            while (arr[type0] == 0) {
                type0++;
            }
            while (arr[type1] == 1) {
                type1--;
            }

            if (type0 <= type1) {
                rotate.swap(arr, type0, type1);
                type0++;
                type1--;
            }
        }
    }

    // Driver program
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1};

        segregate0and1(arr, arr.length);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}

