
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

    public boolean putMark(int row, int col, int markCell){
        //If it's true
        if (board[row][col] == 0) {
            board[row][col] = markCell;
            availableCell--;
            return true;
        //If it's false
        }else {
            System.out.println("This cell is already used");
            return false;
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

    public boolean placeMark(int pos, String user) {
        if (user.equals("Player1")){
            mark = 1;
        }else if (user.equals("CPU") || user.equals("Player2")) {
            mark = 2;
        }
        switch (pos) {
            case 1:
                return putMark(0, 0, mark);
            case 2:
                return putMark(0, 1, mark);
            case 3:
                return putMark(0, 2, mark);
            case 4:
                return putMark(1, 0, mark);
            case 5:
                return putMark(1, 1, mark);
            case 6:
                return putMark(1, 2, mark);
            case 7:
                return putMark(2, 0, mark);
            case 8:
                return putMark(2, 1, mark);
            case 9:
                return putMark(2, 2, mark);
        }
        System.out.println("Wrong number");
        return false;
    }
}


// 1 2 3
// 4 5 6
// 7 8 9