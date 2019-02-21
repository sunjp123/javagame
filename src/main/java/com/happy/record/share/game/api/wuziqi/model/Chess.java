package com.happy.record.share.game.api.wuziqi.model;

import java.util.List;

public class Chess {
    private static final int POSITION_X = 100;
    private static final int POSITION_Y = 100;
    private int[][] board;
    private List<Piece> whitePieces;
    private List<Piece> blackPieces;

    public Chess(){
        board = new int[POSITION_X][POSITION_Y];
    }
    public void addPieceToBoard(int x,int y,int value){
        if(x >= POSITION_X || y >= POSITION_Y || x < 0 || y < 0 || board[x][y] > 0) return;
        board[x][y] = value;
    }
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

}
