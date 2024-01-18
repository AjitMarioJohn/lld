package org.example.lld.models;

import lombok.Getter;
import org.apache.commons.lang3.tuple.Pair;
import org.example.lld.commons.GameUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

@Getter
public class GameBoard {

    private final String id;
    private final int size;
    private final PieceType[][] board;
    private final Stack<Pair<Integer, Integer>> moves;

    public GameBoard(int size) {
        this.size = size;
        this.id = GameUtils.generateId();
        board = new PieceType[size][size];
        moves = new Stack<>();
    }

    /**
     * Used to add the piece to the indices mentioned
     * @param row
     * @param column
     * @param pieceType
     * @return
     */
    public boolean addPiece(int row, int column, PieceType pieceType) {
        if (Objects.nonNull(board[row][column])) {
            return false;
        }
        board[row][column] = pieceType;
        moves.add(Pair.of(row, column));
        return true;
    }

    public void undoMove() {
        Pair<Integer, Integer> pairs = moves.pop();
        board[pairs.getLeft()][pairs.getRight()] = null;
    }

    public void print() {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                PieceType pieceType = board[row][column];
                if (Objects.nonNull(pieceType)) {
                    System.out.print(String.format("  %s  ", pieceType.name()));
                } else {
                    System.out.print("     ");
                }

                if (column < size - 1) {
                    System.out.print("  |  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Will return list of pair containing row and column
     * @return List
     */
    public List<Pair<Integer, Integer>> getFreeCell() {
        List<Pair<Integer, Integer>> freeCell = new ArrayList<>();

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (Objects.isNull(board[row][column])) {
                    freeCell.add(Pair.of(row, column));
                }
            }
        }
        return freeCell;
    }

    public boolean isWinner(PieceType pieceType) {
        for (int row = 0; row < size; row++) {
            boolean rowMatch = true;
            for (int column = 0; column < size; column++) {
                PieceType insertedPieceType = board[row][column];
                rowMatch = rowMatch && Objects.nonNull(insertedPieceType) && pieceType.equals(insertedPieceType);
            }
            if (rowMatch) {
                return true;
            }
        }

        for (int column =0; column < size; column++) {
            boolean columnMatch = true;
            for (int row = 0; row < size; row++) {
                PieceType insertedPieceType = board[row][column];
                columnMatch = columnMatch && Objects.nonNull(insertedPieceType) && pieceType.equals(insertedPieceType);
            }
            if (columnMatch) {
                return true;
            }
        }

        boolean diagonalMatch = true;
        for (int row = 0, column = 0; row < size;  row++, column++) {
            PieceType insertedPieceType = board[row][column];
            diagonalMatch = diagonalMatch && Objects.nonNull(insertedPieceType) && pieceType.equals(insertedPieceType);
        }

        if (diagonalMatch) {
            return true;
        }

        boolean antiDiagonalMatch = true;
        for (int row = 0, column = size - 1; row < size;  row++, column--) {
            PieceType insertedPieceType = board[row][column];
            antiDiagonalMatch = antiDiagonalMatch && Objects.nonNull(insertedPieceType) && pieceType.equals(insertedPieceType);
        }

        return antiDiagonalMatch;
    }
}
