package TicTacToe.Models;

import TicTacToe.Strategy.WinningStrategy.WinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Players> players;
    private List<Move> moves;
    private Players winner;
    private GameState gameState;
    private int nextMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public Game(Board board, List<Players> players, List<Move> moves, Players winner, GameState gameState, int nextMovePlayerIndex, List<WinningStrategy> winningStrategies) {
        this.board = board;
        this.players = players;
        this.moves = moves;
        this.winner = winner;
        this.gameState = gameState;
        this.nextMovePlayerIndex = nextMovePlayerIndex;
        this.winningStrategies = winningStrategies;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Players getWinner() {
        return winner;
    }

    public void setWinner(Players winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
