package com.sample.service.JavaPrograms;

public class TrueCallerAssessment {

  private int[][] chessBoard;
  private int[] xMoves = new int[]{3, 2, 0, -2, -2, 0, 2, -3};
  private int[] yMoves = new int[]{0, 2, 3, 2, -2, -3, -2, 0};

  private static final int size = 10;

  public TrueCallerAssessment() {
    this.chessBoard = new int[size][size];
    initialize();
  }

  boolean isSafe(int x, int y) {
    return (x >= 0 && x < size && y >= 0 &&
        y < size && chessBoard[x][y] == -1);
  }

  public boolean solveProblem(int a, int b) {

    chessBoard[a][b] = 1;

    if (solve(2, a, b)) {
      printSolution();
    } else {
      System.out.print("no solution found");
      return false;
    }
    return true;
  }

  private boolean solve(int mark, int x, int y) {

    if (mark == size * size+1) {
      return true;
    }

    for (int k = 0; k < 8; k++) {
      int nextX = x + xMoves[k];
      int nextY = y + yMoves[k];

      if (isSafe(nextX, nextY)) {

        chessBoard[nextX][nextY] = mark;

        if(chessBoard[nextX][nextY]>80)
        {
          System.out.printf("hii");
        }

        System.out.print("---------"+chessBoard[nextX][nextY]);
        System.out.println();

        if (solve(mark + 1, nextX, nextY)) {
          return true;
        } else {
          chessBoard[nextX][nextY] = -1;
        }
      }

    }
    return false;
  }

  public void printSolution() {
    for (int i = 0; i < chessBoard.length; i++) {
      for (int j = 0; j < chessBoard.length; j++) {
        System.out.print(chessBoard[i][j] + " ");
      }
      System.out.println();
    }

  }

  private void initialize() {

    for (int i = 0; i < chessBoard.length; i++) {
      for (int j = 0; j < chessBoard.length; j++) {
        chessBoard[i][j] = -1;
      }
    }
  }

  public static void main(String args[]) {

    TrueCallerAssessment knightProblem = new TrueCallerAssessment();
    knightProblem.printSolution();
    knightProblem.solveProblem(0, 9);
    knightProblem.printSolution();

  }
}