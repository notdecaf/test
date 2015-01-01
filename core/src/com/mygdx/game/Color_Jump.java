package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.utils.Timer;

public class Color_Jump extends ApplicationAdapter {
	private SpriteBatch batch;
	private TextureAtlas eiselIdle; //holds the information for Eisel's idle pose
    private Sprite eisel;           //the sprite for Eisel
    private int eiselFrame = 1;
    private String currentEiselKey = new String("a");
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		eiselIdle = new TextureAtlas(Gdx.files.internal("data/eisel_idle.atlas"));
        AtlasRegion region = eiselIdle.findRegion("a");
        eisel = new Sprite(region);
        eisel.setPosition(0,0);
	}

    @Override
    public void dispose(){
        batch.dispose();
        eiselIdle.dispose();
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);            //Clears the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        eisel.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height){

    }

    @Override
    public void pause(){

    }

    @Override public void resume(){

    }
}
