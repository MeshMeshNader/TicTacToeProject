/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class GameManager {

    private ArrayList<Cell> board;
    private int gamesCounter;
    public static final int TOTAL_NUM_CELLS = 9;
    private String playerOne;
    private String playerTwo;

    /**
     * @return the gameCounter
     */
    public int getGameCounter() {
        return gamesCounter;
    }

    /**
     * @param gameCounter the gameCounter to set
     */
    public void setGameCounter(int gameCounter) {
        this.gamesCounter = gameCounter;
    }

    public GameManager(String playerOne) {

        this.playerOne = playerOne;
        board = new ArrayList<>();

        gamesCounter = 0;
        for (int i = 0; i < TOTAL_NUM_CELLS; i++) {
            board.add(new Cell());
        }

        newGame();
    }

    public void newGame() {

        gamesCounter = 0;
        for (int i = 0; i < TOTAL_NUM_CELLS; i++) {
            board.get(i).state = CellState.EMPTY;
        }
    }

    public void setCell(int index, CellState state) {

        board.get(index).state = state;
        gamesCounter++;
    }

    public Cell getCell(int index) {
        return board.get(index);
    }

    public boolean isPlayerXWon() {
        // check if O player won in diagonal or row or col 
        return (checkColWin(CellState.XSTATE) == true
                || checkRowWin(CellState.XSTATE) == true
                || checkDiagWin(CellState.XSTATE) == true);

    }

    public boolean isPlayerOWon() {
        // check if X player won in diagonal or row or col 

        return (checkColWin(CellState.OSTATE) == true
                || checkRowWin(CellState.OSTATE) == true
                || checkDiagWin(CellState.OSTATE) == true);
    }

    public boolean isDraw() {
        // Check if the board is full and now player have already won so it will be 
        return (gamesCounter == 9
                && !isPlayerOWon()
                && !isPlayerXWon());
    }

    private boolean checkRowWin(CellState state) {
        if (board.get(0).state == state && board.get(0).state == board.get(1).state && board.get(1).state == board.get(2).state) {
            return true;
        } else if (board.get(3).state == state && board.get(3).state == board.get(4).state && board.get(4).state == board.get(5).state) {
            return true;
        } else if (board.get(6).state == state && board.get(6).state == board.get(7).state && board.get(7).state == board.get(8).state) {
            return true;
        }
        return false;
    }

    private boolean checkColWin(CellState state) {
        if (board.get(0).state == state && board.get(0).state == board.get(3).state && board.get(3).state == board.get(6).state) {
            return true;
        } else if (board.get(1).state == state && board.get(1).state == board.get(4).state && board.get(4).state == board.get(7).state) {
            return true;
        } else if (board.get(2).state == state && board.get(2).state == board.get(5).state && board.get(5).state == board.get(8).state) {
            return true;
        }
        return false;
    }

    private boolean checkDiagWin(CellState state) {
        if (board.get(0).state == state && board.get(0).state == board.get(4).state && board.get(4).state == board.get(8).state) {
            return true;
        } else if (board.get(2).state == state && board.get(2).state == board.get(4).state && board.get(4).state == board.get(6).state) {
            return true;
        }
        return false;
    }
}
