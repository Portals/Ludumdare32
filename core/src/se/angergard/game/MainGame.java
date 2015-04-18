package se.angergard.game;

import se.angergard.game.screen.MainMenuScreen;
import se.angergard.game.screen.PlayScreen;

import com.badlogic.gdx.Game;

public class MainGame extends Game {
	
	@Override
	public void create () {
		//setScreen(new PlayScreen(this));
		setScreen(new MainMenuScreen(this));
	}
}
