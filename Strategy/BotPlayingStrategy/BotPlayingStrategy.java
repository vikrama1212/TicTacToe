package TicTacToe.Strategy.BotPlayingStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface BotPlayingStrategy {
    Move Makemove(Board board);
}
