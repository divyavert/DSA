package com.company;

import java.util.Scanner;

class TicTacToebacktracking {

    final static int SIDE = 3;
    final static int COMPUTER = 1;
    final static int HUMAN = 2;
    final static char COMPUTERMOVE = 'O';
    final static char HUMANMOVE = 'X';
    static Scanner sc = new Scanner(System.in);

    static void intialize(char board[][]) {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                board[i][j] = '*';
            }
        }
    }

    static boolean rowCheck(char board[][]) {

        for (int i = 0; i < SIDE; i++) {
            if ((board[i][0] == board[i][1]) && (board[i][1] == board[i][2]) && board[i][0] != '*') {
                return true;
            }
        }
        return false;

    }

    static boolean colCheck(char board[][]) {
        for (int i = 0; i < SIDE; i++) {
            if ((board[0][i] == board[1][i]) && (board[2][i] == board[0][i]) && board[0][i] != '*') {
                return true;
            }
        }
        return false;
    }

    static boolean diagonalCheck(char board[][]) {

        if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && board[0][0] != '*') {
            return true;
        }
        if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && board[0][2] != '*') {
            return true;
        }

        return false;

    }

    static boolean gameOver(char board[][]) {
        return (rowCheck(board) || colCheck(board) || diagonalCheck(board));
    }

    static void instructions() {
        System.out.println("choose  a number between 1 to 9 to allocate\n");
        System.out.println("  1 | 2 | 3 ");
        System.out.println("--------------");
        System.out.println("  4 | 5 | 6");
        System.out.println("--------------");
        System.out.println("  7 | 8 | 9\n");

    }

    static void printBoard(char board[][]) {
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("--------------");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("--------------");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    static int minmax(char board[][], int dept, boolean isAI) {
        // if score is -10 minimizer wins
        // if score is 0 its a draw
        // if score +10 maximizer wins
        // we will perform backtracking
        int score = 0;
        int bestScore = 0;
        // this is the base condition for over backtracking recursion;
        if (gameOver(board) == true) {
            if (isAI == true) {// game is over and previous turn was of human therefore human wins
                return -10;
            } else {// game is over and previous turn was of computer therefore computer wins
                return 10;
            }
        } else {

            if (dept < 9) {
                if (isAI == true) {
                    bestScore = Integer.MIN_VALUE;
                    for (int i = 0; i < SIDE; i++) {
                        for (int j = 0; j < SIDE; j++) {
                            if (board[i][j] == '*') {
                                board[i][j] = COMPUTERMOVE;
                                score = minmax(board, dept + 1, false);
                                board[i][j] = '*';
                                if (score > bestScore) {
                                    bestScore = score;
                                }
                            }
                        }
                    }
                    return bestScore;
                } else {
                    bestScore = Integer.MAX_VALUE;
                    for (int i = 0; i < SIDE; i++) {
                        for (int j = 0; j < SIDE; j++) {
                            if (board[i][j] == '*') {
                                board[i][j] = HUMANMOVE;
                                score = minmax(board, dept + 1, true);
                                board[i][j] = '*';
                                if (score < bestScore) {
                                    bestScore = score;
                                }
                            }
                        }
                    }
                    return bestScore;
                }
            } else {
                return 0;
            }

        }

    }

    static int bestMove(char board[][], int moveIDX) {
        int x = -1, y = -1;
        int score = 0, bestScore = Integer.MIN_VALUE;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (board[i][j] == '*') {
                    board[i][j] = COMPUTERMOVE;
                    score = minmax(board, moveIDX + 1, false);
                    board[i][j] = '*';
                    if (score > bestScore) {
                        bestScore = score;
                        x = i;
                        y = j;
                    }
                }
            }
        }
        return x * 3 + y;
    }

    static void playTicTacToe(int player) {

        char board[][] = new char[SIDE][SIDE];
        intialize(board);
        instructions();
        int moveIDX = 0, x = 0, y = 0;
        while (gameOver(board) == false && moveIDX != SIDE * SIDE) {
            int n;
            if (player == COMPUTER) {
                n = bestMove(board, moveIDX);
                x = n / SIDE;
                y = n % SIDE;
                board[x][y] = COMPUTERMOVE;
                System.out.println("computer place \'o\' in " + (n + 1) + " position");
                printBoard(board);
                player = HUMAN;
                moveIDX++;

            } else if (player == HUMAN) {
                System.out.print("vacant positions are: ");
                for (int i = 0; i < SIDE; i++) {
                    for (int j = 0; j < SIDE; j++) {
                        if (board[i][j] == '*') {
                            System.out.print(i * 3 + j + 1 + " ");
                        }
                    }
                }
                System.out.println("enter choice from a vacant position: ");
                n = sc.nextInt();
                n--;
                x = n / SIDE;
                y = n % SIDE;
                if (board[x][y] != '*' && n >= 0 && n < 9) {
                    System.out.println("position is not vacant try other position");
                } else if (n < 0 || n >= 9) {
                    System.out.println("invalid position please enter valid position");
                } else {
                    board[x][y] = HUMANMOVE;
                    printBoard(board);
                    player = COMPUTER;
                    moveIDX++;
                }

            }

        }
        if (gameOver(board) == false && moveIDX == SIDE * SIDE)
            System.out.println("Draw");
        else {
            if (player == COMPUTER)
                player = HUMAN;
            else if (player == HUMAN)
                player = COMPUTER;
            declareWinner(player);
        }

    }

    static void declareWinner(int whoseTurn) {
        if (whoseTurn == COMPUTER)
            System.out.println("Computer won");
        else
            System.out.println("Human won");
    }

    public static void main(String[] args) {
        System.out.println("enter 1 if you want to play and 0 if computer want to play first");
        int n;
        n = sc.nextInt();
        if (n == 1) {
            playTicTacToe(HUMAN);
        }
        if (n == 0) {
            playTicTacToe(COMPUTER);
        }

    }
}