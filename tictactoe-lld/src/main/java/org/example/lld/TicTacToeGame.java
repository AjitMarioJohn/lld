package org.example.lld;

import org.example.lld.commons.GameUtils;
import org.example.lld.models.GameBoard;
import org.example.lld.models.PieceType;
import org.example.lld.models.Player;

import java.util.*;

public class TicTacToeGame {
    private Deque<Player> players;
    private GameBoard gameBoard;

    public TicTacToeGame() {
        this.initialize();
    }

    private void initialize() {
        Player crossPlayer = new Player("Jack", PieceType.X);
        Player oPlayer = new Player("Jill", PieceType.O);
        players = new LinkedList<>(List.of(crossPlayer, oPlayer));

        gameBoard = new GameBoard(3);
    }

    public String start() {
        gameBoard.print();

        while (!gameBoard.getFreeCell().isEmpty()) {

            Player playerWithTurn = players.removeFirst();

            System.out.printf("Hi %s please enter %s in row,column", playerWithTurn.getName(), playerWithTurn.getPieceType().name());
            Scanner scanner = new Scanner(System.in);
            String value = scanner.next();

            //TODO need to move the logic to appropriate place
            if (Objects.equals(GameUtils.UNDO, value)) {
                gameBoard.undoMove();
                gameBoard.print();
                players.addLast(playerWithTurn);
                continue;
            }

            String[] values = value.split(",");

            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);

            boolean isAdded = gameBoard.addPiece(row, column, playerWithTurn.getPieceType());

            if (!isAdded) {
                System.out.println("Incorrect indices. Please try again");
                players.addFirst(playerWithTurn);
                continue;
            }

            gameBoard.print();

            boolean isWinner = gameBoard.isWinner(playerWithTurn.getPieceType());
            if (isWinner) {
                return String.format("%s is winner", playerWithTurn.getName());
            }

            players.addLast(playerWithTurn);
        }

        return "It's a tie";
    }
}
