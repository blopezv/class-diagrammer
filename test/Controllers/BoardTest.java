package Controllers;

import Domain.Board.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void createdBoard() {
        try {
            new Board();
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}