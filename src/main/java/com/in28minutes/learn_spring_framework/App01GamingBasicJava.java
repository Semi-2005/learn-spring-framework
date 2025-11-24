package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.superContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        //Object creation and wiring of dependencies
        //game is dependency of GameRunner

        gameRunner.run();

	}

}
