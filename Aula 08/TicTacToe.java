import java.util.Scanner;

public class TicTacToe {
    public enum CellValue {
        X, O, EMPTY
    }

    private CellValue[][] board;
    private CellValue currentPlayer;

    public TicTacToe() {
        board = new CellValue[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = CellValue.EMPTY;
            }
        }
        currentPlayer = CellValue.X;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != CellValue.EMPTY) {
            return false;
        }
        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == CellValue.X) ? CellValue.O : CellValue.X;
        return true;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != CellValue.EMPTY) {
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != CellValue.EMPTY) {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != CellValue.EMPTY) {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != CellValue.EMPTY) {
            return true;
        }
        return false;
    }

    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == CellValue.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        System.out.println("Jogo da Velha!");
        game.printBoard();

        while (true) {
            System.out.println("Jogador " + game.currentPlayer + ", faça sua jogada (linha e coluna): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!game.makeMove(row, col)) {
                System.out.println("Movimento inválido. Tente novamente.");
                continue;
            }

            game.printBoard();

            if (game.checkWin()) {
                System.out.println("Jogador " + (game.currentPlayer == CellValue.X ? "O" : "X") + " venceu!");
                break;
            }

            if (game.checkDraw()) {
                System.out.println("O jogo empatou!");
                break;
            }
        }

        scanner.close();
    }
}