import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Board board = new Board();
        board.initializeBoard();
        board.printBoard();


        board.setTestBoard(1, 1, 1);
        board.printBoard();
        if (board.checkWinner()){
            System.out.println("PLAYER WON");
        }
        // Scanner myObj = new Scanner(System.in);
        // String userName;
        // // Enter username and press Enter
        // System.out.println("Enter username");
        // userName = myObj.nextLine();
        // System.out.println("Username is: " + userName);
        // System.out.println("Goodbye, World!");
    }

}