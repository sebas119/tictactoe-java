
public class Board {

    private int availableCell = 9;
    private int[][] board = new int[3][3];
    private int mark;

    public void initializeBoard() {
        for (int i = 0; i < 3; i++){
            for (int j= 0; j< 3; j++){
                board[i][j] = 0;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++){
            System.out.println("-------");
            for (int j=0; j < 3; j++) {
                System.out.print("|");
                switch (board[i][j]) {
                    case 0:
                        System.out.print(' ');
                        break;
                    case 1:
                        System.out.print('X');
                        break;
                    case 2:
                        System.out.print('O');
                        break;
                }
                if (j == 2){
                    System.out.print("|");
                }
            }
            System.out.print("\n");
        }
        System.out.println("-------");
    }

    public void putMark(int row, int col, int playerId){
        if (board[row][col] == 0) {
            board[row][col] = playerId;
            availableCell--;
        }else {
            System.out.println("This cell is already used");
        }
    }

    public boolean isBoardFull() {
        if (availableCell == 0){
            return true;
        }
        return false;
    }


    public boolean checkRows(){
        for (int i = 0; i < 3; i++){
            if ((board[i][0] == board[i][1]) && (board[i][1] == board[i][2]) && board[i][0] != 0){
                return true;
            }
        }
        return false;
    }
    public boolean checkColumns(){
        for (int i = 0; i < 3; i++){
            if ((board[0][i] == board[1][i]) && (board[1][i] == board[2][i]) && board[0][i] != 0){
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonals(){
        if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && board[0][0] != 0){
            return true;
        }
        else if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && board[0][2] != 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkWinner(){
        if (checkRows()){
            return true;
        }else if (checkColumns()){
            return true;
        }else if (checkDiagonals()){
            return true;
        }else {
            return false;
        }
    }

    public void setTestBoard(int c1, int c2, int c3){
        board[0][0] = c1;
        board[0][1] = c2;
        board[0][2] = c3;
    }
}
