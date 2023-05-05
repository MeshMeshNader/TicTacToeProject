/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

/**
 *
 * @author lenovo
 */
public enum CellState {

    XSTATE("X"), OSTATE("O"), EMPTY("");

    private final String state;

    private CellState(String state) {
        this.state = state;
    }

    public String getCellState() {
        return state;
    }

}
