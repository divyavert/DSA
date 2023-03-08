import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    // this is constant magic matrix which follow rule of sum of 15
    final static int magic_board[][] = {
            { 8, 3, 4 },
            { 1, 5, 9 },
            { 6, 7, 2 }
    };
    // creating a flat magic matrix for easy operations
    final static List<Integer> magic_board_list = Arrays.asList(8, 3, 4, 1, 5, 9, 6, 7, 2);
    // this list keeps track of already occupied cells
    static List<Integer> occupied = new ArrayList<>();

    final static char COMPUTER = 'O';
    final static char HUMAN = 'X';
    final static int n = 3;
    static Scanner sc = new Scanner(System.in);

    static void print_board(char board[][]) {
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("------------");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("------------");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    // check row for victory
    static boolean rowCheck(char board[][]) {

        for (int i = 0; i < n; i++) {
            if ((board[i][0] == board[i][1]) && (board[i][1] == board[i][2]) && board[i][0] != '*') {
                return true;
            }
        }
        return false;

    }

    // check column for victory
    static boolean colCheck(char board[][]) {
        for (int i = 0; i < n; i++) {
            if ((board[0][i] == board[1][i]) && (board[2][i] == board[0][i]) && board[0][i] != '*') {
                return true;
            }
        }
        return false;
    }

    // check diagonal for victory
    static boolean diagonalCheck(char board[][]) {

        if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && board[0][0] != '*') {
            return true;
        }
        if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && board[0][2] != '*') {
            return true;
        }

        return false;

    }

    // if all above case satisfies the game is over
    static boolean gameOver(char board[][]) {
        return (rowCheck(board) || colCheck(board) || diagonalCheck(board));
    }

    // to check for draw condition
    static boolean gameDraw(char board[][]) {
        if (gameOver(board) == true) {
            return false;
        }
        if (gameOver(board) == false) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == '*') {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    // this find the location at which the computer should play to block human or
    // win
    static int find_best_location(List<Integer> scores, int s, int e) {
        Collections.sort(scores);
        if (s == e) {
            return -1;
        }
        while (s < e) {
            int sum = scores.get(s) + scores.get(e);
            int diff = 15 - sum;
            if (magic_board_list.contains(diff)) {
                if (!(occupied.contains(diff))) {
                    // int z = magic_board_list.indexOf(diff);
                    // System.out.print("location: " + z / n + ", ");
                    // System.out.println(z % n);
                    occupied.add(diff);
                    return diff;
                } else {
                    return Math.max(find_best_location(scores, s + 1, e), find_best_location(scores, s, e - 1));
                }
            } else if (diff >= 9) {
                s++;
            } else if (diff <= 0) {
                e--;
            }
        }
        return -1;

    }

    // to initiate location function for blocking the human or winning as computer
    static int[] win_location(char board[][], char player, int moveIDX) {

        int result[] = new int[2];
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == player) {
                    scores.add(magic_board[i][j]);
                }
            }
        }

        int res = find_best_location(scores, 0, scores.size() - 1);
        if (res == -1) {
            // to find best probable location due to less data available
            if (scores.isEmpty()) {
                result[0] = -1;
                result[1] = -1;
            } else if (scores.size() == 1) {
                int temp_res = -1;
                // to face the corner case of insufficient data or only one element present in
                // the score list
                if ((moveIDX == 0 && player == COMPUTER) || (moveIDX <= 1 && player == HUMAN)) {
                    for (int i = 0; i < scores.size(); i++) {
                        int diff = 15 - scores.get(i);
                        for (int j = 0; j < magic_board_list.size(); j++) {
                            if (diff - magic_board_list.get(j) > 0 && diff - magic_board_list.get(j) < 9) {
                                if (!(occupied.contains(diff - magic_board_list.get(j)))) {
                                    temp_res = diff - magic_board_list.get(j);
                                    int z = magic_board_list.indexOf(temp_res);
                                    result[0] = z / n;
                                    result[1] = z % n;
                                    occupied.add(diff - magic_board_list.get(j));
                                    return result;
                                }
                            }
                        }
                    }
                }
                if (temp_res == -1) {
                    result[0] = -1;
                    result[1] = -1;
                    return result;
                }

            } else {
                result[0] = -1;
                result[1] = -1;
                return result;
            }

        } else {
            System.out.println("res is not -1");
            int z = magic_board_list.indexOf(res);
            result[0] = z / n;
            result[1] = z % n;
        }

        return result;

    }

    // main function to play the game
    static void play_game(char board[][], char player, int moveIDX) {

        int loc[] = new int[2];
        Random random = new Random();
        while (gameOver(board) == false && gameDraw(board) == false) {
            if (player == COMPUTER) {
                System.out.println("computer is thinking");
                loc = win_location(board, player, moveIDX);
                if (loc[0] == -1) {
                    loc = win_location(board, HUMAN, moveIDX);
                    if (loc[0] == -1) {
                        System.out.println("not enough data to process next move, thinking randomly!");
                        int x = random.nextInt( 3);
                        int y = random.nextInt( 3);
                        while (board[x][y] != '*') {
                            x = random.nextInt( 3);
                            y = random.nextInt( 3);
                        }
                        board[x][y] = COMPUTER;
                        moveIDX += 1;
                        occupied.add(magic_board[x][y]);
                    } else {
                        System.out.println("Compuer played a calculated move as human was winning");
                        board[loc[0]][loc[1]] = COMPUTER;
                        moveIDX += 1;
                        occupied.add(magic_board[loc[0]][loc[1]]);
                    }
                } else {
                    System.out.println("Compuer played a calculated move as computer was winning");
                    board[loc[0]][loc[1]] = COMPUTER;
                    moveIDX += 1;
                    occupied.add(magic_board[loc[0]][loc[1]]);
                }
                print_board(board);
                player = HUMAN;
            } else if (player == HUMAN) {
                System.out.println("human is thinking");
                int x, y;
                System.out.print("enter location x:");
                x = sc.nextInt();
                System.out.print("enter location y:");
                y = sc.nextInt();
                if (board[x][y] != '*') {
                    System.out.println("alreay occupied");
                } else {
                    board[x][y] = HUMAN;
                    occupied.add(magic_board[x][y]);
                    print_board(board);
                    player = COMPUTER;
                }

            }
        }
        if (gameDraw(board) == true) {
            System.out.println("Match was a draw well played!");
        } else if (player == COMPUTER) {
            System.out.println("Human won!");
        } else {
            System.out.println("Computer Won!");
        }

    }

    public static void main(String[] args) {
        char board[][] = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', '*' } };
        int choice;
        System.out.println("press zero to play first or press 1 to let computer play first");
        choice = sc.nextInt();
        while (choice != 0 && choice != 1) {
            System.out.println("press zero to play first or press 1 to let computer play first");
            choice = sc.nextInt();
        }
        int moveIDX = 0;
        if (choice == 1) {
            play_game(board, COMPUTER, moveIDX);
        } else {
            play_game(board, HUMAN, moveIDX);
        }

    }
}