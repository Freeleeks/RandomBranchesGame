package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.PlayScreen;
import com.mygdx.game.screens.StartMenu;

public class MainGame extends Game {
	public static final int V_WIDTH = 600;
	public static final int V_HEIGHT =400;
	public static SpriteBatch batch;
	public static float stateTime;
	public static PlayScreen playScreen;
	public static StartMenu startMenuM;
	@Override
	public void create () {
		batch = new SpriteBatch();
		//playScreen = new PlayScreen(this);
		startMenuM = new StartMenu(this);
		setScreen(startMenuM);
		stateTime=0;
	}

	@Override
	public void render () {
		stateTime+= Gdx.graphics.getDeltaTime();
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
