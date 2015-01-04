package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.utils.Timer;

public class Color_Jump extends ApplicationAdapter {
	private SpriteBatch batch;
	private TextureAtlas eiselWalk; //holds the information for Eisel's idle pose
    private Sprite eisel;           //the sprite for Eisel
    private Animation animation;
    private float elapsedTime = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		//eiselWalk = new TextureAtlas(Gdx.files.internal("data/eisel_idle.atlas"));
        eiselWalk = new TextureAtlas(Gdx.files.internal("data/eisel_walk.atlas"));
        animation = new Animation(1/10f, eiselWalk.getRegions());
        //eisel.setPosition(Gdx.graphics.getWidth()/2-eisel.getWidth()/2,0);
	}

    @Override
    public void dispose(){
        batch.dispose();
        eiselWalk.dispose();
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);            //Clears the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        elapsedTime+= Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(elapsedTime,true),0,0);
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
