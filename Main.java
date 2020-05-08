import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Board board = new Board();
        String player1, player2;
        int player1Pos, player2Pos;
        int gameMode = 1;
        boolean goodMove;

        board.initializeBoard();

        System.out.println("Choose Game Mode:");
        System.out.println("\tMultiplayer: 1");
        System.out.println("\tSingle player: 2");
        gameMode = scan.nextInt();
        if (gameMode == 1){
            player1 = "Player1";
            player2 = "Player2";
        }else {
            player1 = "Player1";
            player2 = "CPU";
        }
        System.out.println("Started game tic-tac-toe");
        board.printBoard();

        //TODO: Complete goodMove functionality
        do {
            goodMove = false;
            while (goodMove == false){
                System.out.println("Choose place from 1 to 9");
                player1Pos = scan.nextInt();
                goodMove = board.placeMark(player1Pos, player1);
            }
            board.printBoard();

            if (board.checkWinner()){
                System.out.println("Winner: " + player1);
                break;
            }
            goodMove = false;
            while (goodMove == false){
                System.out.println("Choose place from 1 to 9");
                if (player2.equals("CPU")){
                    player2Pos = rand.nextInt(9) + 1;
                    System.out.println("Position chosen by CPU: " + player2Pos);
                }else {
                    player2Pos = scan.nextInt();
                }
                goodMove = board.placeMark(player2Pos, player2);
            }
            board.printBoard();
            if (board.checkWinner()){
                System.out.println("Winner: " + player2);
                break;
            }
        }while(board.isBoardFull() == false);

    }

}