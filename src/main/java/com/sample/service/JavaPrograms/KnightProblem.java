package com.sample.service.JavaPrograms;

public class KnightProblem {

  private static final int size = 8;
  private int[] xMove = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
  private int[] yMove = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
  private int[][] chessBoard;

  public KnightProblem() {
    this.chessBoard = new int[size][size];
    setInitial();
  }

  boolean isSafe(int x, int y) {
    return (x >= 0 && x < size && y >= 0 &&
        y < size && chessBoard[x][y] == -1);
  }

  boolean solveKT() {

    chessBoard[0][0] = 1;

    if (!solveKTUtil(2, 0, 0)) {
      System.out.println("Solution does not exist");
      return false;
    } else {
      print();
    }

    return true;
  }

  boolean solveKTUtil(int movei, int x, int y) {
    int k, next_x, next_y;
    if (movei == size * size + 1) {
      return true;
    }

        /* Try all next moves from the current coordinate
            x, y */
    for (k = 0; k < 8; k++) {

      next_x = x + xMove[k];
      next_y = y + yMove[k];

      if (isSafe(next_x, next_y)) {
        chessBoard[next_x][next_y] = movei;

        if (solveKTUtil(movei + 1,next_x, next_y )) {
          return true;
        } else {
          chessBoard[next_x][next_y] = -1;// backtracking
        }
      }
    }

    return false;
  }

  private void setInitial() {
    for (int i = 0; i < chessBoard.length; i++) {
      for (int j = 0; j < chessBoard.length; j++) {
        chessBoard[i][j] = -1;
      }
    }
  }

  private void print() {
    for (int i = 0; i < chessBoard.length; i++) {
      for (int j = 0; j < chessBoard.length; j++) {
        System.out.print(chessBoard[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {

    KnightProblem knightProblem = new KnightProblem();
    knightProblem.solveKT();
  }

}
