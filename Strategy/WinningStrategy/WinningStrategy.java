package TicTacToe.Strategy.WinningStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.Players;

public interface WinningStrategy {
    boolean checkWinner(Board board, Players player, Cell cell);
}
