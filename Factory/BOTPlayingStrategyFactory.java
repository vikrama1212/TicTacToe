package TicTacToe.Factory;

import TicTacToe.Models.BOTDifficultyLevel;
import TicTacToe.Strategy.BotPlayingStrategy.BotPlayingStrategy;
import TicTacToe.Strategy.BotPlayingStrategy.EasyBotPlayingStrategy;
import TicTacToe.Strategy.BotPlayingStrategy.HardBOTPlayingStrategy;
import TicTacToe.Strategy.BotPlayingStrategy.MediumBotPlaying;

public class BOTPlayingStrategyFactory {
    public static BotPlayingStrategy getBOTPlayingStrategy(BOTDifficultyLevel botDifficultyLevel){

        if(botDifficultyLevel.equals(BOTDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BOTDifficultyLevel.MEDIUM)) {
            return new MediumBotPlaying();

        }
        else{
            return new HardBOTPlayingStrategy();
        }
    }
}
