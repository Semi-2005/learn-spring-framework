package com.in28minutes.learn_spring_framework.game;

public class GameRunner {

	private gamingConsole game;

	
	
	public GameRunner (gamingConsole game) {
		this.game = game ;
	}
	
	public void run() {
		System.out.println("Running game" );
		game.up();
		game.left();
		game.right();
		game.down();
	}
}
