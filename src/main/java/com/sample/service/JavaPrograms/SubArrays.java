package com.sample.service.JavaPrograms;

public class SubArrays {

    public void subArray(int[] arr) {
        // Pick starting point
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Pick ending point
            for (int j = i; j < n; j++) {
                // Print sub array between current starting
                // and ending points
                String hold = "";
                for (int k = i; k <= j; k++) {

                    hold = hold + arr[k];
                }
                System.out.print(hold);
                System.out.println();
            }
        }
    }

    static int getMissingNo(int a[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

    public static void main(String[] args) {
        new SubArrays().subArray(new int[] {1, 2, 3});

        System.out.println("missing number is "+SubArrays.getMissingNo(new int[] {1, 2, 4, 5, 6, 7},6));
    }
}