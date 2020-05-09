import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanMode = new Scanner(System.in);
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
        gameMode = scanMode.nextInt();
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
                Scanner scanPlayer1 = new Scanner(System.in);
                try {
                    System.out.println("Choose place from 1 to 9 Player1");
                    player1Pos = scanPlayer1.nextInt();
                    goodMove = board.placeMark(player1Pos, player1);
                }catch(Exception e) {
                    goodMove = false;
                    System.out.println("Please type just numbers");
                }
            }
            board.printBoard();

            if (board.checkWinner()){
                System.out.println("Winner: " + player1);
                break;
            }
            goodMove = false;
            while (goodMove == false){
                System.out.println("Choose place from 1 to 9 Player2");
                Scanner scanPlayer2 = new Scanner(System.in);
                if (player2.equals("CPU")){
                    player2Pos = rand.nextInt(9) + 1;
                    System.out.println("Position chosen by CPU: " + player2Pos);
                    goodMove = board.placeMark(player2Pos, player2);
                }else {
                    try {
                        player2Pos = scanPlayer2.nextInt(); 
                        goodMove = board.placeMark(player2Pos, player2);                       
                    } catch (Exception e) {
                        goodMove = false;
                        System.out.println("Please type just numbers");
                    }
                }         
            }
            board.printBoard();
            if (board.checkWinner()){
                System.out.println("Winner: " + player2);
                break;
            }
        }while(board.isBoardFull() == false);

    }

}