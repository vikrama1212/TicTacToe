package TicTacToe.Models;

public class Move {
    private Players player;
    private Cell cell;

    public Players getPlayer() {
        return player;
    }

    public void setPlayer(Players player) {
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Move(Players player, Cell cell) {
        this.player = player;
        this.cell = cell;
    }
}
