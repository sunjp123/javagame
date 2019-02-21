package com.happy.record.share.game.api.wuziqi.model;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ChessTest {
    private static final Logger logger = LoggerFactory.getLogger(ChessTest.class);
    @Test
    public void addPieceToBoard() {
        Chess chess = new Chess();
        chess.addPieceToBoard(1,1,1);
        assertEquals("修改信息生效",1,chess.getBoard()[1][1]);
    }

    @Test
    public void getBoard() {
    }

    @Test
    public void setBoard() {
    }

    @Test
    public void getWhitePieces() {
    }

    @Test
    public void setWhitePieces() {
    }

    @Test
    public void getBlackPieces() {
    }

    @Test
    public void setBlackPieces() {
    }

    @Test
    public void addPieceToBoard1() {
    }

    @Test
    public void getBoard1() {
    }

    @Test
    public void setBoard1() {
    }

    @Test
    public void getWhitePieces1() {
    }

    @Test
    public void setWhitePieces1() {
    }

    @Test
    public void getBlackPieces1() {
    }

    @Test
    public void setBlackPieces1() {
    }
}