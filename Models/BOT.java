package TicTacToe.Models;

import TicTacToe.Factory.BOTPlayingStrategyFactory;
import TicTacToe.Strategy.BotPlayingStrategy.BotPlayingStrategy;

public class BOT extends Players{
    private BOTDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BOT(Symbol symbol, String name, PlayerType playerType, BOTDifficultyLevel botDifficultyLevel) {
        super(symbol, name, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy= BOTPlayingStrategyFactory.getBOTPlayingStrategy(botDifficultyLevel);
    }

    public BOTDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BOTDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
