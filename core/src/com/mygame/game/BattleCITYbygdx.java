package com.mygame.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygame.game.Screen.PlayScreen;

public class BattleCITYbygdx extends Game {
	public static	final  int V_WIDTH = 366;
	public static	final  int V_HEIGHT = 430;
	public static	final  float PPM = 100;

	public static final short DEFAULT_BIT = 2;
	public static final short tank_BIT = 2;
	public static final short bullet_BIT = 2;
	public static final short brick_BIT = 4;
	public static final short metal_BIT = 8;
	public static final short DESTROYED_BIT = 16;

	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
