package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.superContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
	
	
		var superContraGame = new superContraGame();
		var gameRunner = new GameRunner(superContraGame);
		var marioGame = new MarioGame();
		var gameRunnerMario = new GameRunner(marioGame);
		var pacmanGame = new PacmanGame();
		var gameRunnerPacman = new GameRunner(pacmanGame);
		
		
	
		gameRunner.run();
		gameRunnerMario.run();
		gameRunnerPacman.run();

	}

}
